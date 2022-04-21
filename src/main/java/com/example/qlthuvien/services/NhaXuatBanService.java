package com.example.qlthuvien.services;

import java.util.List;

import com.example.qlthuvien.entity.NhaXuatBanEntity;
import com.example.qlthuvien.repository.NhaXuatBanRepo;
import com.example.qlthuvien.dto.NhaXuatBanDTO;
import java.util.ArrayList;

public class NhaXuatBanService {
    public static List<NhaXuatBanEntity> getAllNhaXuatBan(NhaXuatBanRepo nhaXuatBanRepo) {
        return nhaXuatBanRepo.findAll();
    }

    public static List<NhaXuatBanDTO> getAllPublisher(NhaXuatBanRepo NhaXuatBanRepo) {
        List<NhaXuatBanDTO> NhaXuatBanDTOs = new ArrayList<>();
        for (var item : NhaXuatBanRepo.findAll()) {
            NhaXuatBanDTOs.add(new NhaXuatBanDTO(item.getManxb(), item.getTennxb()));
        }
        return NhaXuatBanDTOs;
    }
}
