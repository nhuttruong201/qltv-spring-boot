package com.example.qlthuvien.services;

import java.util.List;

import com.example.qlthuvien.entity.NhaXuatBanEntity;
import com.example.qlthuvien.repository.NhaXuatBanRepo;

public class NhaXuatBanService {
    public static List<NhaXuatBanEntity> getAllNhaXuatBan(NhaXuatBanRepo nhaXuatBanRepo) {
        return nhaXuatBanRepo.findAll();
    }
}
