package SS7_ABSTRACT_INTERFACE.BT;

public class Square implements IColorable{
    // Hãy tạo một interface Colorable với một phương thức void có tên howToColor().
    //Cho lớp Square triển khai interface này với phương thức howToColor() hiển thị thông điệp Color all four sides..
    // Với mỗi phần tử trong mảng, hiển thị diện tích của nó, nếu phần tử đó là một Colorable, gọi phương thức howToColor().
    private double side;
    public Square(){

    }
    public Square(double side){
        this.side=side;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }
    public double getPerimeter(){
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ",Area =" + this.getArea() +
                ",Perimeter =" +this.getPerimeter()+
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
