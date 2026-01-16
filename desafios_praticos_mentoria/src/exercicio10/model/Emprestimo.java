/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio10.model;

import java.time.LocalDate;

/**
 *
 * @author juuhl
 */
public class Emprestimo {
    private Aluno aluno;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;
    private LocalDate dataDevolucao;
    private Double multaCalculada;

    public Emprestimo(Aluno aluno, Livro livro) {
        this.aluno = aluno;
        this.livro = livro;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public Double getMultaCalculada() {
        return multaCalculada;
    }
    
    public Double calcularMulta(){
        return 0.0;
    }
    
    
    
}
