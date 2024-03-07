package SS6_Ke_Thua.BT;

public class Point {
    private float x;
    private float y;
    public Point(){

    }
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x=x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y=y;
    }
    public float []getXY(){
        float a[]={getX(),getY()};
        return a;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point p= new Point(1,2);
        System.out.println(p);
        MovablePoint m= new MovablePoint(p,2,3);
        System.out.println(m);
    }
}
class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(){

    }
    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(Point p,float xSpeed,float ySpeed){
        super(p.getX(),p.getY());
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }
    public float getXSpeed(){
        return xSpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }
    public float []getSpeed(){
        float a[]={getXSpeed(),getYSpeed()};
        return a;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "(x,y) = (" +super.getX() +","+super.getY()+")"+
                ",  speed=(xs,ys) = (" + xSpeed +","+ ySpeed+") "+
                '}';
    }
}
