/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.ArrayList;

/**
 *
 * @author juuhl
 */
public class SensorTemperatura {
    private String identificador;
    private String local;
    private double leituraMaxima;
    private double leituraMinima;
    private double somaLeituras;
    private int quantidadeLeituras;
   
    public SensorTemperatura(String identificador, String local) {
        this.identificador = identificador;
        this.local = local;
        leituraMaxima = 0;
        leituraMinima = 0;
        somaLeituras = 0;
        quantidadeLeituras = 0;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getLocal() {
        return local;
    }

    public double getLeituraMaxima() {
        return leituraMaxima;
    }

    public double getLeituraMinima() {
        return leituraMinima;
    }

    public double getSomaLeituras() {
        return somaLeituras;
    }
    
    public void registarLeitura(double valor){
        quantidadeLeituras++;
        somaLeituras += valor;
        
        if (quantidadeLeituras == 1) {
            leituraMinima = valor;
            leituraMaxima = valor;
        } else {
            if (valor < leituraMinima) {
                leituraMinima = valor;
            }
            if (valor > leituraMaxima) {
                leituraMaxima = valor;
            }
        }
    }
    
    public double obterMedia(){
        if (quantidadeLeituras > 0){
            return somaLeituras / quantidadeLeituras;
        }
        return 0f;
    }
    
    public double obterIntervalo(){
       if (quantidadeLeituras < 2) {
            return 0.0; 
        }
        return leituraMaxima - leituraMinima;
    }
    
    
    
    
    
    
}
