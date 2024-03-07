package org.example.entity;
import java.util.List;
public class Sandwich {
    String component;

    public Sandwich(String component) {
        this.component = component;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    @Override
    public String toString() {
        return  component;
    }
}
