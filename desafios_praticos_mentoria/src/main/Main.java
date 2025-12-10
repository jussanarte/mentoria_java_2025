/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import utils.*;
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
        int option;
        
        do{
            System.out.println("--- MENU ---");
            System.out.println("00 - Sair");
            System.out.println("01 - Executar \'ContaTelefonica\'");
            System.out.print("Digite a opcao: ");
            option = sc.nextInt();
            
            switch(option){
            case 0:
                System.exit(0);
                break;
             case 1:
                Exercicio1.executar();
                break;
            }
        }while(option != 34);
    }
    
}
