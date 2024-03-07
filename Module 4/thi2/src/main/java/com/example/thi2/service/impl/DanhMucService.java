package com.example.thi2.service.impl;

import com.example.thi2.entity.DanhMuc;
import com.example.thi2.repository.IDanhMucRepository;
import com.example.thi2.service.IDanhMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DanhMucService implements IDanhMucService {
    @Autowired
    private IDanhMucRepository danhMucRepository;

    @Override
    public List<DanhMuc> findAllByName(String name) {
        return null;
    }

    @Override
    public List<DanhMuc> findAllByDanhMuc(String name) {
        return null;
    }


    @Override
    public boolean create(DanhMuc danhMuc) {
        danhMucRepository.save(danhMuc);
        return true;
    }

    @Override
    public boolean update(DanhMuc danhMuc) {
        danhMucRepository.save(danhMuc);
        return true;
    }

    @Override
    public DanhMuc findById(int id) {
        return danhMucRepository.findById(id).orElse(null);
    }



    @Override
    public List<DanhMuc> findAll() {
        return danhMucRepository.findAll();
    }

    @Override
    public boolean deleteById(int id) {
        danhMucRepository.deleteById(id);
        return true;
    }


}
