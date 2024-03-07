package org.example.model;

public class Student {
    private String name;
    private int point;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Student(String name, int point) {
        this.name = name;
        this.point = point;
    }
}
