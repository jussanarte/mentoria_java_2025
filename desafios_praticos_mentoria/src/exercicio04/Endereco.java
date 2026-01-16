/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio04;

/**
 *
 * @author juuhl
 */
public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String pais;

    public Endereco() {
    }

    public Endereco(String rua, String bairro, String cidade, String pais) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
}
