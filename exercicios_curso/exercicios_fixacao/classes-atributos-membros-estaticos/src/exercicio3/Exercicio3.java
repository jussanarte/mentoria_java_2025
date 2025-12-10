/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author juuhl
 */
public class Exercicio3 {
    public static void exec(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double g1 = sc.nextDouble();
        double g2 = sc.nextDouble();
        double g3 = sc.nextDouble();
        
        Alumn a = new Alumn(name, g1, g2, g3);
        System.out.println("FINAL GRADE = " + a.finalGrade());
        if(a.finalGrade() > 60f){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED\nMISSING " + a.missingPoints() + " POINTS");
        }
    }
}
