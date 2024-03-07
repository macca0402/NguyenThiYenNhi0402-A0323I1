package org.example.repository;

import org.example.model.Music;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MusicRepoImpl implements MusicRepo {
    //    private String name;
//    private String artist;
//    private String kindOfMusic;
//    private String link;
    private static List<Music> list;

    static {
        list = new ArrayList<>();
        list.add(new Music("Mùa xuân năm nay", "Trần Tuấn Hưng", "cổ điển", "https://www.youtube.com/watch?v=a-L5BO3dDQw"));
        list.add(new Music("Chiều nay không có mưa bay", "Trung Quân Idol", "đương đại", "https://www.youtube.com/watch?v=0yGNjxPI3lE"));
    }

    @Override
    public List<Music> getAll() {
        return list;
    }

    @Override
    public void create(Music music) {
        list.add(music);
    }
}
