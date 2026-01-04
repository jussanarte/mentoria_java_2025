/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01.entities;

import exercicio01.enums.WorkerLevel;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author juuhl
 */
public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private ArrayList<HourContract> contracts = new ArrayList();
    private Department department;

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public ArrayList<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        if (contract != null) {
            contracts.add(contract);
        }
    }

    public void removeContract(HourContract contract) {
        if (contract != null) {
            contracts.remove(contract);
        }
    }

    public Double income(int year, int month) {
        Double sum = baseSalary;
        for (HourContract c : contracts) {
            LocalDate date = c.getDate();
            if (date.getMonthValue() == month && date.getYear() == year) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
