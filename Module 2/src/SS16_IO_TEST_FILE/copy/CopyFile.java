package SS16_IO_TEST_FILE.copy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static final String srcSource = "src/SS16_IO_TEST_FILE/sourceFile";
    public static final String srcTarget = "src/SS16_IO_TEST_FILE/targetFile";

    public static void writeFile(String src, String value, boolean append) {
        File file = new File(src);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(value);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("Loi ghi file");
            ;
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println("Loi dong file");
            }
        }
    }

    public static List<String> readFile(String src) {
        List<String> stringList = new ArrayList<>();
        File file = new File(src);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        } catch (IOException e) {
            System.out.println("Loi doc file");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Loi dong file");
            }
        }
        return stringList;
    }

    public static void copy(String source, String target) {
        List<String> list = readFile(source);
        for (String data : list) {
            writeFile(target, data, true);
        }
    }

    public static void main(String[] args) {
        copy(srcSource, srcTarget);
    }
}
