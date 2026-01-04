/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio01;

import exercicio01.entities.*;
import exercicio01.enums.WorkerLevel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author juuhl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's  name: ");
        Department dp = new Department(sc.nextLine());
        System.out.println("Enter Worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());
        System.out.print("Base Salary: ");
        Double salary = sc.nextDouble();
        Worker w = new Worker(name, level, salary, dp);
        System.out.print("How many contracts to this worker?: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("\nEnter contract #" + (i + 1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate date = LocalDate.parse(sc.next(), fmt);
            System.out.print("Value per hour: ");
            Double value = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            w.addContract(new HourContract(date, value, hours));
        }
        
        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year  = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + w.getName());
        System.out.println("Department:  " + w.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("$ %.2f", w.income(year, month)));
       

        sc.close();

    }

}
