package com.example.qlthuvien.repository;

import com.example.qlthuvien.entity.SachEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SachRepo extends JpaRepository<SachEntity, Integer> {

}
