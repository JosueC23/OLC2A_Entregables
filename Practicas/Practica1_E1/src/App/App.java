/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


/**
 *
 * @author Josue
 */
public class App {
    
    /**
     * @param args argumentos de la linea de comando
     */
    
    public static void main(String [] args){
        AnalizarEntrada("entrada.txt");
    }
    
    private static void AnalizarEntrada(String path){
     Analizador.parser pars ;
     try{
         FileInputStream is = new FileInputStream(path);
         BufferedReader bfReader = new BufferedReader(new InputStreamReader(is));
         pars = new Analizador.parser(new Analizador.Lexico(bfReader));
         pars.parse();
         
     } catch (Exception ex) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println("Causa: "+ex.getCause());
     } 
     
    }
    
}
