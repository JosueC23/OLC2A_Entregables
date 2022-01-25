package Analizador;
import java_cup.runtime.*;

%%


%class Lexico
%public 
%line 
%column 
%cup 
%unicode
%ignorecase

%init{ 
      yycolumn = 1;
      yyline = 1;
%init}

blancos = [ \t\r\n]+

//numeros
numero = [1|0]


%{
    
%}

%%



\n {yycolumn=1;}
{blancos} {/*Se ignoran*/}

{numero} {return new Symbol(sym.digito,yycolumn,yyline,yytext());}
//CUALQUIER ERROR:           SIMBOLOS NO DEFINIDOS DENTRO DEL LENGUAJE
.   {
	    System.err.println("Error lexico: "+yytext()+ " Linea:"+(yyline)+" Columna:"+(yycolumn));
    }

