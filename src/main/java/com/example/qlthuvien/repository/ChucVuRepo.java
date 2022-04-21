package com.example.qlthuvien.repository;

import com.example.qlthuvien.entity.ChucVuEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChucVuRepo extends JpaRepository<ChucVuEntity, Integer> {
    ChucVuEntity findById(int id);
}
