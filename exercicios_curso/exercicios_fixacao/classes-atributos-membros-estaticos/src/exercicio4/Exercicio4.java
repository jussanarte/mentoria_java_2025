/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author juuhl
 */
public class Exercicio4 {
    public static void exec(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is the dollar price: ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();
        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
        
        System.out.printf("Amount to be paid in reais= %.2f%n", result);
    }
}
