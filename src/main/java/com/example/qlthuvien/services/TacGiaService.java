package com.example.qlthuvien.services;

import java.util.List;
import java.util.ArrayList;

import com.example.qlthuvien.dto.TacGiaDTO;
import com.example.qlthuvien.repository.TacGiaRepo;

public class TacGiaService {
    public static List<TacGiaDTO> getAllAuthor(TacGiaRepo tacGiaRepo) {
        List<TacGiaDTO> tacGiaDTOs = new ArrayList<>();
        for (var item : tacGiaRepo.findAll()) {
            tacGiaDTOs.add(new TacGiaDTO(item.getMatacgia(), item.getTentacgia()));
        }
        return tacGiaDTOs;
    }
}
