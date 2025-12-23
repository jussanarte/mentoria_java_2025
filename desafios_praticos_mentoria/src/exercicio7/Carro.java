/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio7;

/**
 *
 * @author juuhl
 */
public class Carro extends Veiculo {
    int numeroPortas;
    int capacidadePassageiros;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nNumero de Portas: ").append(numeroPortas);
        sb.append("\nCapacidade de passageiros: ").append(capacidadePassageiros);
        return sb.toString();
    }
    
    
}
