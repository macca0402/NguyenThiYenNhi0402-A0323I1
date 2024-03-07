package SS12.BT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageProduct implements IManageProduct {
    private static final List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("iphone", "01/03/2023", 1, 75000F));
        products.add(new Product("sunsilk", "01/04/2023", 2, 25000F));
        products.add(new Product("samsung", "01/05/2023", 3, 10000F));
        products.add(new Product("nokia", "01/06/2023", 4, 20000F));
    }

    @Override
    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten moi: ");
        String newName = sc.nextLine();
        System.out.println("Nhap ngay san xuat moi: ");
        String newDate = sc.nextLine();
        System.out.println("Nhap id: ");
        int newID = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gia moi:");
        Float newPrice = Float.parseFloat(sc.nextLine());
        Product product = new Product(newName, newDate, newID, newPrice);
        products.add(product);
    }

    @Override
    public void editProduct(int id) {
        int index=findIndexById(id);
//        products.remove(findIndexById(id));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten moi: ");
        String newName = sc.nextLine();
        System.out.println("Nhap ngay san xuat moi: ");
        String newDate = sc.nextLine();
        System.out.println("Nhap gia moi:");
        Float newPrice = Float.parseFloat(sc.nextLine());
        products.set(index, new Product(newName, newDate, id, newPrice));
    }

    public static int findIndexById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()==id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void deleteProduct(int id) {
        products.remove(findIndexById(id));
    }

    @Override
    public void searchNameProduct() {
        boolean isName=false;
        Scanner sc= new Scanner(System.in);
        System.out.println("Moi ban nhap ten san pham : ");
        String nameSearch=sc.nextLine();
        for(int i=0;i<products.size();i++){
            if(products.get(i).getNameProduct().equals(nameSearch)){
                System.out.println(products.get(i).toString());
                isName=true;
            }
        }
        if(isName==false){
            System.out.println("Không tìm thấy tên trong dánh sách.");
        }
    }

    @Override
    public void sortAscending(Product product) {


    }

    @Override
    public void sortDescending(Product product) {

    }

    @Override
    public void displayAll() {
        for(Product product:products){
            System.out.println(product+"\n");
        }
    }


    @Override
    public List<Product> getAll() {
        return products;
    }
}
