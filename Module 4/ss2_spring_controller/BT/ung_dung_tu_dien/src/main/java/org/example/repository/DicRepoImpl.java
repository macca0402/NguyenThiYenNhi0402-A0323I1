package org.example.repository;

import org.example.entity.Dictionary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class DicRepoImpl implements DicRepo{
    private static List<Dictionary> list;
    static {
        list =new ArrayList<>();
        list.add(new Dictionary("school","trường học"));
        list.add(new Dictionary("teacher","cô giáo"));
        list.add(new Dictionary("interface","giao diện"));
        list.add(new Dictionary("class","lớp học"));
        list.add(new Dictionary("season","mùa ( thời tiết )"));
    }

    public String result(String key) {
        String result=null;
        for (Dictionary word:list) {
            if( word.getWordEnglish().equals(key)){
                result=word.getWordVietNam();
                break;
            } else {
                result = "Khong tim thay";
            }
        }
        return result;
    }
}
