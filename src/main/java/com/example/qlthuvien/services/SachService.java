package com.example.qlthuvien.services;

import java.util.ArrayList;
import java.util.List;

import com.example.qlthuvien.dto.SachDTO;
import com.example.qlthuvien.entity.SachEntity;
import com.example.qlthuvien.repository.SachRepo;

public class SachService {

    public static List<SachDTO> getAllBook(SachRepo sachRepo) {
        List<SachEntity> sachEntities = sachRepo.findAll();
        List<SachDTO> sachDTOs = new ArrayList<>();
        for (var i : sachEntities) {
            sachDTOs.add(new SachDTO(i.getMasach(), i.getTensach(), i.getSoluong(), i.getNamxuatban(),
                    i.getTheLoaiEntity().getTentheloai(), i.getManxb()));
        }

        return sachDTOs;
    };
}
