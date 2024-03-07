package SS12.BT;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        ManageProduct manageProduct=new ManageProduct();
        Scanner scanner= new Scanner(System.in);
        while(true){
            System.out.println("1.Them ");
            System.out.println("2.Chinh sua");
            System.out.println("3.Tim kiem theo tên");
            System.out.println("4.Xoa theo ID");
            System.out.println("5.Hien thi danh sach");
            System.out.println("Moi ban chon ");
            int chon=Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    manageProduct.addProduct();
                    break;
                case 2:
                    //loi
                    System.out.println("Moi ban nhap id: ");
                    int id=Integer.parseInt(scanner.nextLine());
                    manageProduct.editProduct(id);
                    break;
                case 3:
                    manageProduct.searchNameProduct();
                    break;
                case 4:
                    //loi
                    System.out.println("Moi ban nhap id: ");
                     id = Integer.parseInt(scanner.nextLine());
                    manageProduct.deleteProduct(id);
                    break;
                case 5:
                    manageProduct.displayAll();
                    break;
            }
        }

    }
}
