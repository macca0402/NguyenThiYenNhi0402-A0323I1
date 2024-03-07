package SS6_Ke_Thua.BT;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        String result="Point 2D co gia tri x= "+x+" y= "+ y+ "{";
        for(int i=0;i<getXY().length;i++){
            result+=getXY()[i]+"\t";
        }
        result+="}";
        return result;
    }

    public float[] getXY() {
        float[] array={getX(),getY()};
        return array;
    }

}

class Point3D extends Point2D {
    private float z;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(Point2D p,float z){
        super(p.getX(), p.getY());
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        setZ(z);
    }

    public float[] getXYZ() {
        float[] array = {super.getX(), super.getY(), z};
        return array;
    }

    @Override
    public String toString() {
        String result="Point 2D co gia tri x= "+ super.getX()+" y= "+ super.getY() +" z = "+z+ "{";
        for(int i=0;i<getXYZ().length;i++){
            result+=getXYZ()[i]+"\t";
        }
        result+="}";
        return result;

    }
}

class Main {
    public static void main(String[] args) {
        Point2D a = new Point2D();
        a = new Point2D(1, 2);
        System.out.println(a);
        Point3D b = new Point3D();
        b = new Point3D(a,3);
        System.out.println(b);
    }
}
