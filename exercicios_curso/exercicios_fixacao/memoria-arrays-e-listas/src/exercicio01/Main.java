/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio01;

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
        Scanner scanf = new Scanner(System.in);
        Rent[] rooms = new Rent[10];
        
        System.out.print("How many room will be rented?: ");
        int n = scanf.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println("\nRent #" + (i+1) + ":");
            System.out.print("Name: ");
            scanf.nextLine();
            String name = scanf.nextLine();
            System.out.print("Email: ");
            String email = scanf.nextLine();
            System.out.print("Room: ");
            int room = scanf.nextInt();
            rooms[room] = new Rent(name, email);   
        }
        System.out.println("\nBusy rooms: ");
        for(int i = 0; i < 10; i++){
            if(rooms[i] != null){
                System.out.println(i + ": " + rooms[i]);
            }
        }
        
    }
    
}
