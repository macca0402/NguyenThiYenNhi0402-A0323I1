package org.example.service;

import org.example.model.Music;
import org.example.repository.MusicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicRepo musicRepo;

    @Override
    public List<Music> getAll() {
        return musicRepo.getAll();
    }

    @Override
    public void create(Music music) {
        musicRepo.create(music);
    }
}
