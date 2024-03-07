package SS3_Mang_Method.TH;

public class MinArray {
    public static int minValue(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -11, 21, 3, 423, 55, 654, 634, 5, -119};
        int result = minValue(a);
        System.out.println("Gia tri min cua mang: " + result);

    }
}
