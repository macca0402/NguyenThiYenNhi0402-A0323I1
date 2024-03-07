package ss2_array_loop.BT;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        SoNguyenToNhoHon100 s = new SoNguyenToNhoHon100();
        int b = 0;
        while (true) {
            if (s.xetSoNguyenTo(b)) {
                if(b<100){
                    System.out.print(b + "  ");
                }
            }
            b++;
        }

    }

    boolean xetSoNguyenTo(int a) {
        if (a < 2) {
            return false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
