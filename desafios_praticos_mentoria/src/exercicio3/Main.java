/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

/**
 *
 * @author juuhl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PedidoOnlineSimples pos = new PedidoOnlineSimples("PED-2025-001", "Headset Bluetooth",3,15000f);
        pos.calcularTotal();
        System.out.println(pos);
        pos.marcarComoPago();
        System.out.println(pos);
        pos.marcarComoEnviado();
        System.out.println(pos);
        
        
    }
    
}
