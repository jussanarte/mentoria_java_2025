/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package exercicio01.enums;

/**
 *
 * @author juuhl
 */
public enum WorkerLevel {
    JUNIOR, MID_LEVEL, SENIOR;

    @Override
    public String toString() {
        String name = null;
        switch(this){
            case JUNIOR -> {
                name = "Junior";
            }
            case MID_LEVEL -> {
                name = "MidLevel";
            }
            case SENIOR -> {
                name = "Senior";
            }     
        }
        return name;
    }
    
    
}
