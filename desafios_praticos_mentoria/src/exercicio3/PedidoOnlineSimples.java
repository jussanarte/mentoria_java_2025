/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 *
 * @author juuhl
 */
public class PedidoOnlineSimples {
    private int quantidade;
    private double precoUnitario;
    private String numeroPedido;
    private String descricaoProduto;
    private EstadoPedido estado;
    
    
    
    
    
    public double calcularTotal(){
        return quantidade * precoUnitario;
    }
    
    public void marcarComoPago(){
        estado = EstadoPedido.PAGO;
    }
    
     public void marcarComoEnviado(){
        if(estado == EstadoPedido.PAGO){
            estado = EstadoPedido.ENVIADO;
        }
    }
}
