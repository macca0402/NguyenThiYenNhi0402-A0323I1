package SS7_ABSTRACT_INTERFACE.TH.LopFruit;

public class MainFruit {
    public static void main(String[] args) {
        Fruit[] fruits= new Fruit[2] ;
        fruits[0]=new Orange();
        fruits[1]=new Apple();
        for(Fruit f:fruits){
            System.out.println(f.howToEat());

        }
    }
}
