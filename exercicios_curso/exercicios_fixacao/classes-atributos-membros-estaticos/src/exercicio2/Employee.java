/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author juuhl
 */
public class Employee {
    private String name;
    private double gross_Salary;
    private double tax;

    public Employee(String name, double gross_Salary, double tax) {
        this.name = name;
        this.gross_Salary = gross_Salary;
        this.tax = tax;
    }
    
    public double netSalary(){
        return gross_Salary - tax;
    }
    
    public void increaseSalary(double percentage){
        gross_Salary += gross_Salary * (percentage / 100);
    }

    public String getName() {
        return name;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    
    
    
}

