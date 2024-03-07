package SS10.TH;

public class TestBasicList {
    public static void main(String[] args) {
        BasicList<Integer> listInteger=  new BasicList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);

        System.out.println("element 1: "+ listInteger.get(0));
        System.out.println("element 2: "+ listInteger.get(1));
        System.out.println("element 3: "+ listInteger.get(2));

        listInteger.get(-1);
        System.out.println("element 6: "+listInteger.get(-1));
    }
}
