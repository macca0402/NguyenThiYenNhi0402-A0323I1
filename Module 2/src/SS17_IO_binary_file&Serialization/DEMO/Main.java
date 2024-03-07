package SS17.DEMO;

import SS12.demo.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Student17> studentList = new ArrayList<>();
//        studentList.add(new Student17("Nhi",999,"VietNam"));
//        studentList.add(new Student17("Nhi",999,"VietNam"));
//        studentList.add(new Student17("Nhi",999,"VietNam"));
//        studentList.add(new Student17("Nhi",999,"VietNam"));
        // GHI FILE
//        File file=new File("src/SS17/DEMO/test.txt");
//        ObjectOutputStream objectOutputStream=null;
//        try {
//            FileOutputStream fileOutputStream=new FileOutputStream(file);
//            objectOutputStream =new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(studentList);
//        }catch (FileNotFoundException e){
//            throw new RuntimeException(e);
//        } catch(IOException e){
//            throw new RuntimeException(e);
//        } finally {
//            try{
//                objectOutputStream.close();
//            } catch(IOException e){
//                throw new RuntimeException(e);
//            }
//        }
        //DOC FILE
        File file=new File("src/SS17/DEMO/test.txt");
        ObjectInputStream objectInputStream=null;
        try{
            FileInputStream fileInputStream=new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            List<Student> student=(List<Student>) objectInputStream.readObject();
            System.out.println(student);
        } catch(FileNotFoundException e){
            throw new RuntimeException(e);
        } catch(IOException e){
            throw new RuntimeException(e);
        } catch(ClassNotFoundException e){
            throw  new RuntimeException(e);
        } finally {
            try{
                objectInputStream.close();
            } catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }
}
