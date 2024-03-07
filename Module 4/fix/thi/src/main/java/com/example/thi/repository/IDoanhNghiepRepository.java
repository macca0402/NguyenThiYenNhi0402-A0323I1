package com.example.thi.repository;

import com.example.thi.entity.DoanhNghiep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoanhNghiepRepository extends JpaRepository<DoanhNghiep,Integer> {
}
