package com.example.thi.service.impl;

import com.example.thi.entity.DuAn;
import com.example.thi.repository.IDuAnRepository;
import com.example.thi.service.IDuAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DuAnService implements IDuAnService {
    @Autowired
    private IDuAnRepository duAnRepository;

    @Override
    public boolean create(DuAn duAn) {
        duAnRepository.save(duAn);
        return true;
    }

    @Override
    public boolean update(DuAn duAn) {
        duAnRepository.save(duAn);
        return true;
    }

    @Override
    public DuAn findById(int id) {
        return duAnRepository.findById(id).orElse(null);
    }

    @Override
    public List<DuAn> findAll() {
        return duAnRepository.findAll();
    }

    @Override
    public boolean deleteById(int id) {
        duAnRepository.deleteById(id);
        return true;
    }

    @Override
    public Page<DuAn> findAllAndPaging(Pageable pageable) {
        return duAnRepository.findAll(pageable);
    }
}
