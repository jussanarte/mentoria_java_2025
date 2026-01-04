/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03.entities;

import exercicio03.enums.OrderStatus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author juuhl
 */
public class Order {
    private LocalDateTime moment = LocalDateTime.now();
    private OrderStatus status;
    private Client client;
    private ArrayList<OrderItem> items = new ArrayList<>();
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }
    
    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Client getClient() {
        return client;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }
    
    public void addItem(OrderItem item){
        if(item != null){
            items.add(item);
        }
    }
    public void removeItem(OrderItem item){
        if(item != null){
            items.remove(item);
        }
    }
    public Double total(){
       Double total = 0.0;
       for(OrderItem i : items){
           total += i.subTotal();
       }
       return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY");
        sb.append("\nOrder moment: ").append(moment.format(fmt));
        sb.append("\nOrder status: ").append(status);
        sb.append("\nClient: ").append(client);
        sb.append("\nOrder items:");
        for(OrderItem i : items){
            sb.append(i).append("\n");
        }
        sb.append("\nTotal price: $").append(String.format("%.2f", total()));
        return sb.toString();
    }
    
    
    
    
}
