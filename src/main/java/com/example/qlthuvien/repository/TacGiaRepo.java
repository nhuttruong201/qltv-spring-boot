package com.example.qlthuvien.repository;

import com.example.qlthuvien.entity.TacGiaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacGiaRepo extends JpaRepository<TacGiaEntity, Integer> {
    TacGiaEntity findById(int id);
}
