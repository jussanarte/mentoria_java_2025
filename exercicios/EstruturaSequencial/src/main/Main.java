/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import exercicios.*;

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
        Scanner read = new Scanner(System.in);
        int option;
        do{
            System.out.println("\nMENU");
            System.out.println("00 - Sair");
            System.out.println("01 - Executar Soma");
            System.out.println("02 - Executar Area");
            System.out.println("03 - Executar Diferenca");
            System.out.println("04 - Executar Salario");
            System.out.println("05 - Executar Pecas ");
            System.out.println("06 - Executar ");
            System.out.print("Digite a opcao: ");
            option = read.nextInt();
            
            switch(option){
                case 0 -> System.out.println("Saindo...");
                case 1 -> {
                    Soma.exec();
                }
                case 2 -> {
                    Area.exec();
                }
                case 3 -> {
                    Diferenca.exec();
                }
                 case 4 -> {
                    Salario.exec();
                }
                case 5 -> {
                    Pecas.exec();
                }
                case 6 -> {
                    FigurasGeometricas.exec();
                }
                
                default -> System.out.println("Opcao Invalida! Tente de novo");
            }
        }while(option != 0);
    }
    
}
