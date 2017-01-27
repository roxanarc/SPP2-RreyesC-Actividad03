/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rreyesc.act03;
import java.util.Scanner;
/**
 *
 * @author roxana
 */
public class SPP2RreyesCAct03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración de variables 
        Scanner keyboard = new Scanner (System.in);
        int numero ;
        int exponente;
//Utilizacion de Mat.pow para obtener el resultado de un numero elevado a un exponente
            System.out.println("Inserte numero");
        numero = keyboard.nextInt();
             System.out.println("Inserte exponente");
        exponente= keyboard.nextInt();
         System.out.println("El resultado es");
         System.out.println(Math.pow(numero,exponente));
         
    }
    
}
