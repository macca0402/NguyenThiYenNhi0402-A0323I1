package SS17.BT;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static List<Product> productList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static final String SRC = "src/SS17/DEMO/test.txt";

    public static void writeFile() {
        File file = new File("src/SS17/BT/testBT_SS17");
        ObjectOutputStream objectOutputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            System.out.println("Ghi file thanh cong ");
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        } catch (IOException e) {
            System.out.println("Loi ghi file ");
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file ");
            }
        }
    }

    public static void readFile() {
        File file = new File("src/SS17/BT/testBT_SS17");
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            List<Product> product = (List<Product>) objectInputStream.readObject();
            System.out.println(product);
        } catch (FileNotFoundException e) {
            System.out.println("Loi khong tim thay file.");
        } catch (IOException e) {
            System.out.println("Loi doc file.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                System.out.println("Loi dong file.");
            }
        }

    }


    public static void add() {
        Product product = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma: ");
        int code = Integer.parseInt(sc.nextLine());
        System.out.println("Ten: ");
        String name = sc.nextLine();
        System.out.println("San xuat: ");
        String sx = sc.nextLine();
        System.out.println("Gia: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("Mo ta: ");
        String moTa = sc.nextLine();
        productList.add(new Product(code, name, sx, price, moTa));
        System.out.println("Them moi thanh cong.");

    }

    public static void displayAll() {
        for (Product p : productList) {
            System.out.println(p.toString());
        }
    }

    public static void search() {
        System.out.println("Nhap code can tim: ");
        int code = Integer.parseInt(sc.nextLine());
        Product product2 = null;
        for (Product p : productList) {
            if (p.getCode() == code) {
                product2 = p;
            }
        }
        for (int i = 0; i < productList.size(); i++) {
            if (productList.contains(product2)) {
                System.out.println("Ket qua tim thay: ");
                System.out.println(product2.toString());
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Moi ban chon chuc nang: ");
            System.out.println("1.Them");
            System.out.println("2.Tim ");
            System.out.println("3.Hien thi danh sach.");
            System.out.println("4.Ghi file.");
            System.out.println("5.Doc file");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    displayAll();
                    break;
                case 4:
                    writeFile();
                    break;
                case 5:
                    readFile();
                    break;
            }
        }


    }
}
