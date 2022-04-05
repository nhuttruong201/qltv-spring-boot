package com.example.qlthuvien.repository;

import java.util.List;

import com.example.qlthuvien.entity.SachEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SachRepo extends JpaRepository<SachEntity, Integer> {
    // @Query("SELECT * FROM SachEntity INNER JOIN TheLoaiEntity ON
    // SachEntity.matheloai == theLoaiEntity.matheloai")

}
