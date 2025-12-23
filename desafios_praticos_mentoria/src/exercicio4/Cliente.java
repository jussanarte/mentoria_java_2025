/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

/**
 *
 * @author juuhl
 */
public class Cliente {
    private String nome;
    private String nif;
    private String telefone;
    private Endereco endereco;

    public Cliente(String nome, String nif, String telefone, Endereco endereco) {
        this.nome = nome;
        this.nif = nif;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Cliente(String nome, String nif) {
        this.nome = nome;
        this.nif = nif;
    }

    public Cliente() {
    }
    
    
    public String getNome() {
        return nome;
    }

    public String getNif() {
        return nif;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void atualizarTelefone(String novoTelefone){
        if(novoTelefone != null ){
            telefone = novoTelefone;
        }
    }
    
    public void atualizarEndereco(Endereco novoEndereco){
        if(novoEndereco != null ){
            endereco = novoEndereco;
        }
    }

    

   
}
