package com.example.thi2.repository;

import com.example.thi2.entity.DanhMuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDanhMucRepository extends JpaRepository<DanhMuc,Integer> {
}
