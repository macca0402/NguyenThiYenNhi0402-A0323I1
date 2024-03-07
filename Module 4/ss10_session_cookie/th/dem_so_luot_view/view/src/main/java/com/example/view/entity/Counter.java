package com.example.view.entity;

public class Counter {
    private int count;

    public int increment() {
        return count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Counter() {
    }

    public Counter(int count) {
        this.count = count;
    }
}
