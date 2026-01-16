/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio10.model;

/**
 *
 * @author juuhl
 */
public class Aluno {
    private String nome;
    private final String numeroAluno;
    private String curso;

    public Aluno(String nome, String numeroAluno, String curso) {
        this.nome = nome;
        this.numeroAluno = numeroAluno;
        this.curso = curso;
    }

    public Aluno(String nome, String numeroAluno) {
        this.nome = nome;
        this.numeroAluno = numeroAluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroAluno() {
        return numeroAluno;
    }
    
    public boolean podeEmprestar(){
        return true;
    }
    
    
}
