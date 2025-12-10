/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author juuhl
 */
public class Diferenca {
    public static void exec(){
        Scanner sc = new Scanner(System.in);
        
        int A, B, C, D;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        
        System.out.println("DIFERENCA = " + (A*B - C*D));
    }
}
