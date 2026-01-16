/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

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

    public PedidoOnlineSimples() {
    }

    public PedidoOnlineSimples(String numeroPedido, String descricao, int quantidade, double precoUnitario) {
        this.estado = EstadoPedido.NOVO;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.numeroPedido = numeroPedido;
        this.descricaoProduto = descricao;
    }
   
    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    
    public EstadoPedido getEstado() {
        return estado;
    }
    
     public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numero do Pedido: ").append(numeroPedido);
        sb.append("\nDescricao do Produto: ").append(descricaoProduto);
        sb.append("\nEstado: ").append(estado);
        sb.append("\nValor total: ").append(calcularTotal());
        return sb.toString();
    }
}
