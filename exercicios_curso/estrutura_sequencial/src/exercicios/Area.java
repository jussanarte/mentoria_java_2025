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
public class Area {
    public static void exec(){
        Scanner sc = new Scanner(System.in);
        
        float raio = sc.nextFloat();
        
        System.out.printf("A=%.4f",(Math.PI * raio * raio));
    }
}
