package org.example.repository;

import org.example.model.Music;
import java.util.List;
public interface MusicRepo {
    List<Music> getAll();
    void create(Music music);
}
