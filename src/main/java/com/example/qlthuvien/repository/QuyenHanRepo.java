package com.example.qlthuvien.repository;

import com.example.qlthuvien.entity.QuyenHanEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuyenHanRepo extends JpaRepository<QuyenHanEntity, Integer> {

}
