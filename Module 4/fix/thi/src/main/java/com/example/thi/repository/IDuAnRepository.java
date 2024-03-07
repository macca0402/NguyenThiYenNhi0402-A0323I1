package com.example.thi.repository;

import com.example.thi.entity.DuAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuAnRepository extends JpaRepository<DuAn,Integer> {
}
