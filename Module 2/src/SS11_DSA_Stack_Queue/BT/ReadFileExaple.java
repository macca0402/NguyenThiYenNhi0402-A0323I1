package SS11.BT;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExaple {
    public static void main(String[] args) {
        BufferedReader reader=null;
        try{
            // Mở file
            reader = new BufferedReader(new FileReader("G:\\CODEGYM\\MODULE2\\src\\SS11\\file.txt"));
            //Đọc từng dòng và in ra màn hình
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                // Đóng file
                if(reader != null){
                    reader.close();
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        }
    }


