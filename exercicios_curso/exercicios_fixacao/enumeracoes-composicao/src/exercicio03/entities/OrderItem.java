/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03.entities;

/**
 *
 * @author juuhl
 */
public class OrderItem {
   private Integer quantity;
   private Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }
   
    public Integer getQuantity() {
        return quantity;
    }
    
    public Product getProduct() {
        return product;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public Double subTotal(){
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
        return product + ", Quantity: " + quantity + ", Subtotal: $" + subTotal();
    }
    
    
    
    
    
   
   
}
