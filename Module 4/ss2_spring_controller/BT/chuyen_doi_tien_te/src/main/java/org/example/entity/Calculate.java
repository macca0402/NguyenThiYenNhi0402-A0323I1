package org.example.entity;

public class Calculate {
    float usd;
    float vnd;

    public Calculate(float usd) {
        this.usd = usd;
    }

    public Calculate(float usd, float vnd) {
        this.usd = usd;
        this.vnd = vnd;
    }
    public Calculate() {
    }
    public float getUsd() {
        return usd;
    }

    public void setUsd(float usd) {
        this.usd = usd;
    }

    public float getVnd() {
        return vnd;
    }

    public void setVnd(float vnd) {
        this.vnd = vnd;
    }
}
