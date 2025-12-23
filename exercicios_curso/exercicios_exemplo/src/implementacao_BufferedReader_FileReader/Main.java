/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementacao_BufferedReader_FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author juuhl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Implementação manual com FileReader e BufferedReader
        /**
         * FileReader fr = null;
         * BufferedReader br = null;
         * No finally a gente fechava com br.close() e fr.close();
         */
        
        String path = "file.txt";
        
        //Try-with-resources
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
