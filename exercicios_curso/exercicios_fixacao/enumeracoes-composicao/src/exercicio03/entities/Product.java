/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03.entities;

/**
 *
 * @author juuhl
 */
public class Product {
    private String name; 
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
    
    

    @Override
    public String toString() {
        return name + ", " + price;
    }
    
    
    
}
