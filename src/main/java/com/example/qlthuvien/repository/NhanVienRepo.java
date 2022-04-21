package com.example.qlthuvien.repository;

import com.example.qlthuvien.entity.NhanVienEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepo extends JpaRepository<NhanVienEntity, Integer> {
    NhanVienEntity findByEmail(String email);

}
