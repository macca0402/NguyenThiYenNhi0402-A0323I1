package com.example.thi2.service.impl;

import com.example.thi2.entity.TinTuc;
import com.example.thi2.repository.ITinTucRepository;
import com.example.thi2.service.ITinTucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TinTucService implements ITinTucService {
    @Autowired
    private ITinTucRepository tinTucRepository;

    @Override
    public List<TinTuc> findAllByName(String name) {
        return tinTucRepository.findAllByTieuDeContaining(name);
    }

    @Override
    public List<TinTuc> findAllByDanhMuc(String name) {
        return tinTucRepository.findAllByDanhMucTenDoanhMuc(name);
    }


    @Override
    public boolean create(TinTuc tinTuc) {
        tinTucRepository.save(tinTuc);
        return true;
    }

    @Override
    public boolean update(TinTuc tinTuc) {
        tinTucRepository.save(tinTuc);
        return true;
    }

    @Override
    public TinTuc findById(int id) {
        return tinTucRepository.findById(id).orElse(null);
    }




    @Override
    public List<TinTuc> findAll() {
        return tinTucRepository.findAll();
    }

    @Override
    public boolean deleteById(int id) {
        tinTucRepository.deleteById(id);
        return true;
    }
}
