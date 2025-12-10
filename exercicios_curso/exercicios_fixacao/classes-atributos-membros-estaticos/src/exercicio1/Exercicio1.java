/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;
import java.util.Scanner;

/**
 *
 * @author juuhl
 */
public class Exercicio1 {
    public static void exec(){
        Scanner sc = new Scanner(System.in);
        double height;
        double width;

        System.out.println("Enter rectangle width and height:");
        width = sc.nextDouble();
        height = sc.nextDouble();
        
        Rectangle r = new Rectangle(height, width);
        double area = r.area();
        double perimeter = r.perimeter();
        double diagonal = r.diagonal();
        
        System.out.printf("AREA = %.2f\nPERIMETER = %.2f\nDIAGONAL = %.2f\n", area, perimeter, diagonal);
                
        
    }
    
    
    
    
}
