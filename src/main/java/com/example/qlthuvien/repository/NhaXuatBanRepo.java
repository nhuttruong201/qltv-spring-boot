package com.example.qlthuvien.repository;

import com.example.qlthuvien.entity.NhaXuatBan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface NhaXuatBanRepo extends JpaRepository<NhaXuatBan, String> {
    NhaXuatBan findByManhaxuatban(String manhaxuatban);
}
