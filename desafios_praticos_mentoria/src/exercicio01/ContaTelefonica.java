/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

/**
 *
 * @author juuhl
 */
public class ContaTelefonica {
    private String numeroTelefone;
    private String plano;
    private int limiteDadosMB;
    private int dadosConsumidosMB;
    private double valorMensalBase;
    private double valorPorMBExcedente;

    public ContaTelefonica(String numeroTelefone, String plano, int limiteDadosMB, double valorMensalBase, double valorPorMBExcedente) {
        this.numeroTelefone = numeroTelefone;
        this.plano = plano;
        this.limiteDadosMB = limiteDadosMB;
        this.valorMensalBase = valorMensalBase;
        this.valorPorMBExcedente = valorPorMBExcedente;
        this.dadosConsumidosMB = 0;
    }
    
    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public String getPlano() {
        return plano;
    }

    public int getLimiteDadosMB() {
        return limiteDadosMB;
    }

    public int getDadosConsumidosMB() {
        return dadosConsumidosMB;
    }

    public double getValorMensalBase() {
        return valorMensalBase;
    }

    public double getValorPorMBExcedente() {
        return valorPorMBExcedente;
    }
    
    public void setLimiteDadosMB(int limiteDadosMB) {
        this.limiteDadosMB = limiteDadosMB;
    }

    public void setValorMensalBase(double valorMensalBase) {
        this.valorMensalBase = valorMensalBase;
    }

    public void setValorPorMBExcedente(double valorPorMBExcedente) {
        this.valorPorMBExcedente = valorPorMBExcedente;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }
    
    
    public void registarConsumoDados(int mb){
       if(mb > 0){
           this.dadosConsumidosMB += mb;
       }
    }
    
    public int calcularExcedenteMB(){
        int excedente = dadosConsumidosMB - limiteDadosMB;
        if(excedente <=  0){
            return 0;
        }else{
            return excedente;
        }
    }
    
    public double calcularValorAPagar(){
        return valorMensalBase + calcularExcedenteMB() * valorPorMBExcedente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numero de telefone: ").append(numeroTelefone);
        sb.append("\nPlano: ").append(plano);
        sb.append("\nDados Consumidos: ").append(dadosConsumidosMB).append(" MB");
        sb.append("\nExcedente: ").append(calcularExcedenteMB()).append(" MB");
        sb.append("\nValor total a pagar: ").append(calcularValorAPagar()).append(" KZs");
        return sb.toString();
    }

    
    
}
