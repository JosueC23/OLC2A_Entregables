package Analizador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josue
 */
public class Analizador {
    /**
     * @param args the command line arguments
     */
    
   public static void main(String[] args)
   {
        generarCompilador();
   }

   
   private static void generarCompilador()
   {
       try {
            String ruta = "src/Analizador/";
            String opcFlex[] = {ruta + "Lexico.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
       
            String opcCup[] = {"-destdir" , ruta , "-parser" , "parser", ruta + "Sintactico.cup"};
            java_cup.Main.main(opcCup);
           
        } catch (Exception e) {
            e.printStackTrace();
            
        }
   }
   
}
