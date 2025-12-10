/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author juuhl
 */
public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }


    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    
    public double area(){
        return height * width;
    }
    public double perimeter(){
        return height * width;
    }
    public double diagonal(){
        return height * width;
    }
    
}
