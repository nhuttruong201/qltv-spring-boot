package com.example.qlthuvien.repository;

import com.example.qlthuvien.entity.QuyenHanNhanVienEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuyenHanNhanVienRepo extends JpaRepository<QuyenHanNhanVienEntity, Integer> {

}
