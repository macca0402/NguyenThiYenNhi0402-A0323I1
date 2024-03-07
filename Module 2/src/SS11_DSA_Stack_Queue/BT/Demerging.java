//package SS11.BT;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.*;
//import java.util.Queue;
//
//class Record {
//    String name;
//    String gender;
//    Date date;
//
//    Record(String name, String gender, Date date) {
//        this.name = name;
//        this.gender = gender;
//        this.date = date;
//    }
//
//}
//
//
//public class Demerging {
//    public static void main(String[] args) {
//        //Khởi tạo danh sách
//        Record[] records = {
//                new Record("nghit", "nam", new Date(12 / 8 / 2003)),
//                new Record("tan", "nam", new Date(12 / 8 / 2001)),
//                new Record("Nhi", "nu", new Date(12 / 8 / 2009)),
//
//        };
//        ArrayList<Record> NU = new ArrayList<>();
//        ArrayList<Record> NA = new ArrayList<>();
//        for (Record i : records) {
//            if (i.gender.toLowerCase(Locale.ROOT).equals("nu")) {
//                NU.add(i);
//            } else if (i.gender.toLowerCase(Locale.ROOT).equals("nam")) {
//                NA.add(i);
//            }
//        }
//        Comparator<Record> dateComparator = new Comparator<Record>() {
//            @Override
//            public int compare(Record r1, Record r2) {
//                //Sử dụng compareTo() để so sánh các đối tượng Date
//                return r1.date.compareTo(r2.date);
//            }
//        };
//
////Sắp xếp danh sách NU theo date tăng dần
//        Collections.sort(NU, dateComparator);
//
////Sắp xếp danh sách NA theo date tăng dần
//        Collections.sort(NA, dateComparator);
//
//
//        // Phân loại và nạp vào queue
////        for (Record i : records) {
////            if (i.gender.equals("nu")) {
////                NU.add(i);
////            } else if (i.gender.equals("nam")) {
////                NA.add(i);
////            }
////        }
//        try {
//            FileWriter fw = new FileWriter("G:\\\\CODEGYM\\\\MODULE2\\\\src\\\\SS11\\\\file.txt");
//            while (!NU.isEmpty()) {
//                Record record = NU.;
//                fw.write(record.name + "\n");
//            }
//            while (!NA.isEmpty()) {
//                Record record = NA.poll();
//                fw.write(record.name + "\n");
//            }
//            //
//            fw.close();
//            System.out.println("Demerging thanh cong");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//   }
//}
