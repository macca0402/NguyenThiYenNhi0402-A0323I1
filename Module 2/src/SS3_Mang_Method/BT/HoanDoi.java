package SS3_Mang_Method.BT;

public class HoanDoi {
    public static void main(String[] args) {
        int []array={1,2,3,4,5};
        int tam=array[0];
        array[0]=array[1];
        array[1]=tam;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+"\t");
        }

    }
}
