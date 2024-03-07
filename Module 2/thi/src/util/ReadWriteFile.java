package util;

import model.GiaoVien;
import model.LopHoc;
import model.SinhVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public void writeFileObject(String src,Object value, boolean append){
        File file=new File(src);
        BufferedWriter bufferedWriter=null;
        try{
            FileWriter fileWriter=new FileWriter(file,append);
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(value.toString());
            bufferedWriter.newLine();
        } catch (IOException e){
            System.out.println("Fault write file");
        } finally{
            try{
                bufferedWriter.close();
            } catch(IOException e){
                System.out.println("Fault close file.");
            }
        }

    }
    public void writeFileGiaoVien(String src, List<GiaoVien> values, boolean append){
        File file=new File(src);
        BufferedWriter bufferedWriter=null;
        try{
            FileWriter fileWriter=new FileWriter(file,append);
            bufferedWriter=new BufferedWriter(fileWriter);
            for(Object value:values){
                bufferedWriter.write(value.toString());
                bufferedWriter.newLine();
            }

        } catch (IOException e){
            System.out.println("Fault write file");
        } finally{
            try{
                bufferedWriter.close();
            } catch(IOException e){
                System.out.println("Fault close file.");
            }
        }

    }
    public void writeFileMaLop(String src, List<LopHoc> values, boolean append){
        File file=new File(src);
        BufferedWriter bufferedWriter=null;
        try{
            FileWriter fileWriter=new FileWriter(file,append);
            bufferedWriter=new BufferedWriter(fileWriter);
            for(Object value:values){
                bufferedWriter.write(value.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e){
            System.out.println("Fault write file");
        } finally{
            try{
                bufferedWriter.close();
            } catch(IOException e){
                System.out.println("Fault close file.");
            }
        }

    }
    public void writeFileSinhVien(String src, List<SinhVien> values, boolean append){
        File file=new File(src);
        BufferedWriter bufferedWriter=null;
        try{
            FileWriter fileWriter=new FileWriter(file,append);
            bufferedWriter=new BufferedWriter(fileWriter);
            for(Object value:values){
                bufferedWriter.write(value.toString());
                bufferedWriter.newLine();
            }

        } catch (IOException e){
            System.out.println("Fault write file");
        } finally{
            try{
                bufferedWriter.close();
            } catch(IOException e){
                System.out.println("Fault close file.");
            }
        }

    }
    public List<String> readFile(String src) {
        List<String> list = new ArrayList<>();
        File file = new File(src);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);

            }
        } catch (FileNotFoundException e) {
            System.out.println("File no exist");
        } catch (IOException e) {
            System.out.println("Fault read file");
        }finally {
            try{
                bufferedReader.close();
            } catch (IOException e){
                System.out.println("Fault close file");
            }
        }
        return list;
    }
}
