package com.example.qlthuvien.repository;

import com.example.qlthuvien.entity.PhieuPhatEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuPhatRepo extends JpaRepository<PhieuPhatEntity, Integer> {

}
