package com.example.qlthuvien.repository;

import com.example.qlthuvien.entity.NhaXuatBanEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhaXuatBanRepo extends JpaRepository<NhaXuatBanEntity, Integer> {

}
