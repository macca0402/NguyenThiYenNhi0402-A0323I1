package org.example.model;

public class Student {
    private String name;
    private int point;
//private String type;

//    public Student(String name, int point, String type) {
//        this.name = name;
//        this.point = point;
//        this.type = type;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

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

    public Student() {
    }

    public Student(String name, int point) {
        this.name = name;
        this.point = point;
    }
}
