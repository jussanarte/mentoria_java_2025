/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio07;

/**
 *
 * @author juuhl
 */
public class Camiao extends Veiculo {
    int capacidadeCargaToneladas;
    int numeroEixos;
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nCapacidade de carga em toneladas: ").append(capacidadeCargaToneladas);
        sb.append("\nNumero de Eixos: ").append(numeroEixos);
        return sb.toString();
    }
}
