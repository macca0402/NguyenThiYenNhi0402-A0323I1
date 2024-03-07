package SS11.BT;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        BufferedWriter writer=null;
        try {
            //Mở file để ghi
            writer =new BufferedWriter(new FileWriter("G:\\CODEGYM\\MODULE2\\src\\SS11\\file.txt"));
            //Ghi dữ liệu vào file
            writer.write("Nhi xinh dep");
        }catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                // Đóng file
                if(writer != null){
                    writer.close();
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
