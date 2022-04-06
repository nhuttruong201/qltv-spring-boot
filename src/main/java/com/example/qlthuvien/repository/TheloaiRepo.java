package com.example.qlthuvien.repository;

import com.example.qlthuvien.entity.TheLoaiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheloaiRepo extends JpaRepository<TheLoaiEntity, Integer> {
    TheLoaiEntity findById(int id);
}
