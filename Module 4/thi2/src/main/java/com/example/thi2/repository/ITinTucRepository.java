package com.example.thi2.repository;


import com.example.thi2.entity.TinTuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITinTucRepository extends JpaRepository<TinTuc,Integer> {
    public List<TinTuc> findAllByTieuDeContaining(String name);
    public List<TinTuc> findAllByDanhMucTenDoanhMuc(String name);

}
