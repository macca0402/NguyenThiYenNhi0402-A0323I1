package org.example.repository;

import org.example.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
public interface ImageRepo extends JpaRepository<Image,Integer> {
}
