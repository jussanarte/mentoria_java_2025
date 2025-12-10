/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import exercicio1.ContaTelefonica;
/**
 *
 * @author juuhl
 */
public class Exercicio1 {
    public static void executar(){
        ContaTelefonica ct = new ContaTelefonica("923456789", "Pos-pago", 5000, 10000f, 5f);
        System.out.println("Conta Telefonica ---");
        System.out.println(ct);
        
        ct.registarConsumoDados(2000);
        ct.registarConsumoDados(1500);
        ct.registarConsumoDados(2500);
        
        System.out.println("Conta Telefonica: Pos Consumo ---");
        System.out.println(ct);
    }
}
