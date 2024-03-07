package SS16_IO_TEST_FILE;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String> read(String src){
        List<String> stringList=new ArrayList<>();
        File file=new File(src);
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try{
            fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String line;
            while((line=bufferedReader.readLine())!= null){
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        } catch (IOException e) {
            System.out.println("loi doc file");
        } finally{
            try {
                bufferedReader.close();
            } catch(IOException e){
                System.out.println("Loi dong file.");

            }
        }
        return stringList;
    }

    public static void main(String[] args) {
        List<String> list=read("G:\\CODEGYM\\MODULE2\\src\\SS16_IO_TEST_FILE\\read");
        for(String data:list ){
            String[] splitData=data.split(",");
            System.out.println(splitData[0]+"||"+splitData[1]+"||"+splitData[2]);
        }
    }
}
