/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

/**
 *
 * @author juuhl
 */
public class CurrencyConverter {
    private static double IOF = 0.06;
    
     public static double dollarToReal(double amount, double dollarPrice) {
        return amount * dollarPrice * (1.0 + IOF);
     }
 }
    
    

