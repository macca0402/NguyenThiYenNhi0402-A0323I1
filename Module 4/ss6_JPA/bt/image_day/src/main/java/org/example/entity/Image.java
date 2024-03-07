package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int point;
    private int tim;
    private String author;
    private String feedback;

    public Image(int id, int point, int tim, String author, String feedback) {
        this.id = id;
        this.point = point;
        this.tim = tim;
        this.author = author;
        this.feedback = feedback;
    }

    public Image(int point, String author, String feedback) {
        this.point = point;
        this.author = author;
        this.feedback = feedback;
        this.tim=0;
    }

    public Image() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getTim() {
        return tim;
    }

    public void setTim(int tim) {
        this.tim = tim;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
