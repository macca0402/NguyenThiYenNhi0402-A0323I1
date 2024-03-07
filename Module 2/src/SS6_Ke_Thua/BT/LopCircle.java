package SS6_Ke_Thua.BT;



public class LopCircle {
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public LopCircle() {

    }

    public LopCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "LopCircle{" +
                "radius=" + radius +
                ",color=" + color +
                ",area: " + getArea() +
                '}';
    }

    public static void main(String[] args) {
        LopCircle circle = new LopCircle();
        circle = new LopCircle(9, "Green");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder(11);
        System.out.println(cylinder);
    }

}


class Cylinder extends LopCircle {
    private double height;

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * Math.pow(getRadius(), 2) * Math.PI;
    }

    public Cylinder() {

    }

    public Cylinder( double height) {
        super();
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + super.getRadius() +
                ", color =" + super.getColor() +
                ", volume =" + getVolume() +
                '}';
    }
}
