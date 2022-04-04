package com.example.qlthuvien.repository;

import com.example.qlthuvien.entity.CTPhieuMuonEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CTPhieuMuonRepo extends JpaRepository<CTPhieuMuonEntity, Integer> {

}
