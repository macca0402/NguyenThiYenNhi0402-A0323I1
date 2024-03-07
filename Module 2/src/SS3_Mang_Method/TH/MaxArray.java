package SS3_Mang_Method.TH;

public class MaxArray {
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 4, 5, 6};
        int max = mang[0];
        int index = 1;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] > max) {
                max = mang[i];
                index = i;
            }
        }
        System.out.println("Gia tri max: " + max + " tai vi tri: " + index);
    }

}
