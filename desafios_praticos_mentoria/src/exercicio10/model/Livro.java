/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio10.model;

/**
 *
 * @author juuhl
 */
public class Livro {
    private String titulo;
    private String isbn;
    private Integer anoPublicacao;
    private Integer exemplaresTotais;
    private Integer exemplaresDisponiveis;
    private Autor autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Integer getExemplaresTotais() {
        return exemplaresTotais;
    }

    public void setExemplaresTotais(Integer exemplaresTotais) {
        this.exemplaresTotais = exemplaresTotais;
    }

    public Integer getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }

    public void setExemplaresDisponiveis(Integer exemplaresDisponiveis) {
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public void baixarExemplar(){
        
    }
    public void disponibilizarExemplar(){
        
    }
    
}
