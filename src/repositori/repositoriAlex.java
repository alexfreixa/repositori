/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositori;

import java.util.Scanner;

/**
 *
 * @author Alex Freixa
 */
public class repositoriAlex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor = 0;
        System.out.print("Escriu un numero: ");
        valor = in.nextInt();
        sumadeu(valor);
        System.out.print("Sumem 10: " + valor);
    }
    
    public static int sumadeu(int valor) {
        int y = 10;
        return valor+y;
    }
    
    public static void text(){
        System.out.println("Hola món!");
        System.out.println("Hola món!");
    }
}
