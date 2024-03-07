package SS5_ACCESS_MODIFIER.BT;

public class Circle {
    private double radius=1;
    private String color="red";
    private boolean filled=true;
    public Circle(){

    }
    public Circle(double r){
        this.radius=r;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius=radius;
        this.color=color;
        this.filled=false;

    }

    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
    static class testCircle{
        public static void main(String[] args) {
            Circle circle= new Circle();
            System.out.println(circle.getRadius());
            System.out.println(circle.getArea());
        }
    }
}

