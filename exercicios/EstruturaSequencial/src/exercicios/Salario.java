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
public class Salario {
    public static void exec(){
        Scanner sc = new Scanner(System.in);
        
        int numFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        float valorPorHora = sc.nextFloat();
        
        System.out.println("NUMBER = " + numFuncionario + "\nSALARY = U$ " + (horasTrabalhadas * valorPorHora));
    }
}
