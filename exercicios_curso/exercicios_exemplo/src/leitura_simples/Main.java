/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leitura_simples;

import java.io.File;
import java.io.IOException;
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
        // Leitura simples usando File e Scanner
        Scanner sc = null;
        File file = new File("file.txt");
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            if(sc != null){
                sc.close();
            }
        }
    }
    
}
