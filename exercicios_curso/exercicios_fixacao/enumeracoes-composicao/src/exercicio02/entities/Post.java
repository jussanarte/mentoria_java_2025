/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author juuhl
 */
public class Post {

    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;
    private ArrayList<Comment> comments = new ArrayList<>();
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Integer getLikes() {
        return likes;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment c) {
        if (c != null) {
            comments.add(c);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(likes).append(" likes - ").append(moment.format(fmt));
        sb.append("\n").append(content);
        sb.append("\nComments: \n");
        for (Comment c : comments) {
            sb.append(c).append("\n");
        }
        return sb.toString();
    }

}
