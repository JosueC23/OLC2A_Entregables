package Analizador;
import java_cup.runtime.Symbol;

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

//letras
letra = [a-zA-Z]


//Identificadores
nombre = {letra}+

%{
    
%}

%%


"," {return new Symbol(sym.comaa,yycolumn,yyline,yytext());}

\n {yycolumn=1;}
{blancos} {/*Se ignoran*/}

{nombre} {return new Symbol(sym.nombre,yycolumn,yyline,yytext());}

//CUALQUIER ERROR:           SIMBOLOS NO DEFINIDOS DENTRO DEL LENGUAJE
.   {
	    System.err.println("Error lexico: "+yytext()+ " Linea:"+(yyline)+" Columna:"+(yycolumn));
    }

