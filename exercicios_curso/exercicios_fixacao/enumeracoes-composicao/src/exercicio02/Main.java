/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio02;

import exercicio02.entities.Comment;
import exercicio02.entities.Post;
import java.time.LocalDateTime;

/**
 *
 * @author juuhl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016, 6, 21, 13, 05, 44);
        LocalDateTime ldt2 = LocalDateTime.of(2018, 7, 28, 23, 14, 19);
        Post p1 = new Post(ldt1, "Traveling to New Zealand", "Im going to this wonderful country!", 12);
        Post p2 = new Post(ldt2, "Good night guys", "See you tomorrow", 5);
        
        p1.addComment(new Comment("Have a nice trip"));
        p1.addComment(new Comment("Wow thats awesome!"));
        
        p2.addComment(new Comment("Good night"));
        p2.addComment(new Comment("May the Force be with you"));
        
        System.out.println(p1);
        System.out.println(p2);
    }
    
}
