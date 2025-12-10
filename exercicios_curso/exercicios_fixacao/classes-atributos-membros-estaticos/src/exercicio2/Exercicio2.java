/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author juuhl
 */
public class Exercicio2 {
    public static void exec(){
        Scanner sc = new Scanner(System.in);
                    
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross Salary: ");
        double gross_Salary = sc.nextDouble();
        System.out.print("Tax: ");
        double tax = sc.nextDouble();
        
        Employee e = new Employee(name, gross_Salary, tax);
        
        System.out.println("\nEmployee: " + e.getName() + ", $ " + e.netSalary());
        
        System.out.print("\nWhich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        
        e.increaseSalary(percentage);
        
        System.out.println("\nUpdated data: " + e.getName() + ", $ " + e.netSalary());
        
    }
}
