package com.example.qlthuvien.repository;

import java.util.List;

import com.example.qlthuvien.entity.CTPhieuMuonEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CTPhieuMuonRepo extends JpaRepository<CTPhieuMuonEntity, Integer> {
    List<CTPhieuMuonEntity> findByMaphieumuon(int maphieumuon);
}
