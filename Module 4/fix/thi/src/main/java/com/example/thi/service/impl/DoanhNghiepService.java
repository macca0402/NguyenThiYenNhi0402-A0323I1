package com.example.thi.service.impl;

import com.example.thi.entity.DoanhNghiep;
import com.example.thi.entity.DuAn;
import com.example.thi.repository.IDoanhNghiepRepository;
import com.example.thi.service.IDoanhNghiepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoanhNghiepService implements IDoanhNghiepService {
    @Autowired
    private IDoanhNghiepRepository doanhNghiepRepository;
    @Override
    public boolean create(DoanhNghiep doanhNghiep) {
        doanhNghiepRepository.save(doanhNghiep);
        return true;
    }

    @Override
    public boolean update(DoanhNghiep doanhNghiep) {
        doanhNghiepRepository.save(doanhNghiep);
        return true;
    }

    @Override
    public DoanhNghiep findById(int id) {
        return doanhNghiepRepository.findById(id).orElse(null);
    }

    @Override
    public List<DoanhNghiep> findAll() {
        return doanhNghiepRepository.findAll();
    }

    @Override
    public boolean deleteById(int id) {
         doanhNghiepRepository.deleteById(id);
         return true;
    }

    @Override
    public Page<DoanhNghiep> findAllAndPaging(Pageable pageable) {
        return null;
    }


}
