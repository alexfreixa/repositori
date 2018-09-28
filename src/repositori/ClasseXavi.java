/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repositori;

import java.util.Scanner;

/**
 *
 * @author Xavi
 */
public class ClasseXavi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        fantasma();
        System.out.println("1 + 3 = " + suma());
    }
    
    public static void fantasma(){
        System.out.println("SOC UN FANTASMAA UUUUHH");
    }
    public static int suma(){
        return 1+2;
    }
}
