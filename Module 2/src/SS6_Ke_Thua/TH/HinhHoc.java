package SS6_Ke_Thua.TH;

public class HinhHoc {
    private String color = "green";
    private boolean filled = true;

    public HinhHoc() {

    }

    public HinhHoc(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled() {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color of "
                + getColor()
                + "and"
                + (isFilled() ? "filled" : "not filled");
    }

    public static class ShapeTest {
        public static void main(String[] args) {
            HinhHoc hinhHoc = new HinhHoc();
            System.out.println(hinhHoc);
            hinhHoc = new HinhHoc("red", false);
            System.out.println(hinhHoc);
        }
    }
}

class HinhTron extends HinhHoc {
    private double radius = 1.0;

    public HinhTron() {

    }

    public HinhTron(double radius) {
        this.radius = radius;
    }

    public HinhTron(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
  public double getPerimeter(){
        return 2*radius*Math.PI;
  }

    @Override
    public String toString() {
        return "HinhTron =" +
                +getRadius()
                +", which is a subclass of "
                +super.toString();
    }

    public static class TestTron {
        public static void main(String[] args) {
            HinhTron tron= new HinhTron();
            System.out.println(tron);
            tron= new HinhTron(3.5);
            System.out.println(tron);
            tron= new HinhTron(3.5,"indigo",false);
            System.out.println(tron);
        }
    }
}
