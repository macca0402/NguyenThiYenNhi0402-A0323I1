//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package SS4_OOP.BT;

public class Fan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5.0D;
    private String color = "Blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSlow() {
        return 1;
    }

    public int getMedium() {
        return 2;
    }

    public int getFast() {
        return 3;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.isOn()) {
            System.out.println("Fan 1 : ");
            return "Toc do : " + this.speed + ", Mau sac: " + this.color + ", Ban kinh : " + this.radius + ", Quat dang bat";
        } else {
            System.out.println("Fan 2 : ");
            return "Mau sac: " + this.color + ", Ban kinh : " + this.radius + ", Quat dang tat";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(fan1.getFast());
        fan1.setColor("Yellow");
        fan1.setRadius(10.0D);
        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setSpeed(fan2.getMedium());
        fan2.setRadius(5.0D);
        fan2.setColor("Blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
