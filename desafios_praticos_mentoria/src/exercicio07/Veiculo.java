/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio07;

/**
 *
 * @author juuhl
 */
public class Veiculo {
   String matricula;
   String marca;
   String modelo;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Matricula: ").append(matricula);
        sb.append("\nMarca: ").append(marca);
        sb.append("\nModel: ").append(modelo);
        return sb.toString();
    }
   
   
}
