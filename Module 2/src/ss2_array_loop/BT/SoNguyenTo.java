package ss2_array_loop.BT;

public class SoNguyenTo {
    public static void main(String[] args) {
        SoNguyenTo s = new SoNguyenTo();
        int i = 1;
        int b = 0;
        int count = 20;
        while (i <= count) {
            if (s.xetSoNguyenTo(b)) {
                System.out.print(b + "  ");
                i++;
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
