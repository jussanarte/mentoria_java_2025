/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 *
 * @author juuhl
 */
public class Alumn {
    String name;
    double grade1;
    double grade2;
    double grade3;

    public Alumn(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        if(grade1 < 31){
            this.grade1 = grade1;
        }
        if(grade2 < 36){
           this.grade2 = grade2;
        }
        if(grade3 < 36){
           this.grade3 = grade3; 
        }
      
    }
    
    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }
    
    public double missingPoints(){
        return 60 - finalGrade();
    }
    
    
    
}
