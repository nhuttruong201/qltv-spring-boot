package com.example.qlthuvien.services;

import java.util.ArrayList;
import com.example.qlthuvien.repository.TheloaiRepo;
import com.example.qlthuvien.dto.TheLoaiDTO;
import java.util.List;

public class TheLoaiService {
    public static List<TheLoaiDTO> getAllCategory(TheloaiRepo theloaiRepo) {
        List<TheLoaiDTO> theLoaiDTOs = new ArrayList<>();
        for (var item : theloaiRepo.findAll()) {
            theLoaiDTOs.add(new TheLoaiDTO(item.getMatheloai(), item.getTentheloai()));
        }
        return theLoaiDTOs;
    }
}
