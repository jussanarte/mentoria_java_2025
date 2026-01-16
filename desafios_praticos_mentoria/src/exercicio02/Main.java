/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio02;

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
        SensorTemperatura st = new SensorTemperatura("SALA-01", "Laboratorio de Redes");
        
        st.registarLeitura(22.5);
        st.registarLeitura(23.0);
        st.registarLeitura(24.2);
        st.registarLeitura(21.8);
        st.registarLeitura(23.5);
        
        System.out.println(st);
        
    }
    
}
