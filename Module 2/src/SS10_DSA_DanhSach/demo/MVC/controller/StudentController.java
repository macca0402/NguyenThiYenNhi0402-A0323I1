package SS10.demo.MVC.controller;

import SS10.demo.MVC.service.IStudentService;
import SS10.demo.MVC.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private static IStudentService iStudentService=new StudentService();
    private static Scanner scanner=new Scanner(System.in);
    public static void menu(){
        IStudentService iStudentService= new StudentService();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("1.Thêm mới");
            System.out.println("2.Chỉnh sửa");
            System.out.println("3.Hiển thị danh sách");
            System.out.println("4.Xóa ");
            int choice=0;
            try{
                choice=Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Nhập không đúng định dạng");
            }
            switch (choice){
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:

                    break;
                case 3:
                    iStudentService.displayAllStudent();
                    break;
                case 4:
                    iStudentService.removeStudent();
            }
        }
    }

}
