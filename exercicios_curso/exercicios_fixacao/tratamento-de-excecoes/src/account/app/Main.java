/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package account.app;

import account.model.entities.Account;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import reservation.model.exceptions.DomainException;

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

        try {
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.next();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double limit = sc.nextDouble();
            
            Account ac = new Account(number, holder, balance, limit);
            
            System.out.print("\nEnter amount to withdraw: ");
            double withdraw = sc.nextDouble();
            ac.withdraw(withdraw);
            System.out.println(" New balance: " + ac.getBalance());
            
        }catch(DomainException e){
            System.err.println(e.getMessage());
        }
    }
    
}
