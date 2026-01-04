/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entities.Account;
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
        Scanner sc = new Scanner(System.in);
        Account acc = null;
        
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char answer = sc.next().toLowerCase().charAt(0);
        if (answer == 'y') {
            System.out.print("Enter initial deposit value: ");
            double balance = sc.nextDouble();
            acc = new Account(number, holder, balance);
        } else {
            acc = new Account(holder, number);
        }

        System.out.println("\nAccount data: ");
        System.out.println(acc);
        
        System.out.print("\nEnter deposit value: ");
        double amount = sc.nextDouble();
        acc.deposit(amount);
        System.out.println("Updated account data: ");
        System.out.println(acc);

        System.out.print("\nEnter a withdraw value: ");
        amount = sc.nextDouble();
        acc.withdraw(amount);
        System.out.println("Updated account data: ");
        System.out.println(acc);
    }

}
