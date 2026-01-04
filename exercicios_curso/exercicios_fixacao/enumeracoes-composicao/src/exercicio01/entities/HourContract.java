/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01.entities;

import java.time.LocalDate;

/**
 *
 * @author juuhl
 */
public class HourContract {
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;
           
    public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }
    
    public HourContract() {
    }
    
    public LocalDate getDate() {
        return date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public Double totalValue(){
        return valuePerHour * hours;
    }
 
}
