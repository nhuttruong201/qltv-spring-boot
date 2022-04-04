package com.example.qlthuvien.repository;

import com.example.qlthuvien.entity.PhieuMuonEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuMuonRepo extends JpaRepository<PhieuMuonEntity, Integer> {

}
