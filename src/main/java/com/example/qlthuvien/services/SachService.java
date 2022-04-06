package com.example.qlthuvien.services;

import java.util.ArrayList;
import java.util.List;

import com.example.qlthuvien.dto.BookInfoDTO;
import com.example.qlthuvien.dto.NhaXuatBanDTO;
import com.example.qlthuvien.dto.SachDTO;
import com.example.qlthuvien.dto.TacGiaDTO;
import com.example.qlthuvien.dto.TheLoaiDTO;
import com.example.qlthuvien.entity.NhaXuatBanEntity;
import com.example.qlthuvien.entity.SachEntity;
import com.example.qlthuvien.entity.TacGiaEntity;
import com.example.qlthuvien.repository.NhaXuatBanRepo;
import com.example.qlthuvien.repository.SachRepo;
import com.example.qlthuvien.repository.TacGiaRepo;
import com.example.qlthuvien.repository.TheloaiRepo;

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

    public static BookInfoDTO getBookInfo(TacGiaRepo tacGiaRepo, TheloaiRepo theloaiRepo,
            NhaXuatBanRepo nhaXuatBanRepo) {

        List<TacGiaDTO> authors = new ArrayList<>();
        List<TheLoaiDTO> categories = new ArrayList<>();
        List<NhaXuatBanDTO> publishers = new ArrayList<>();

        for (var i : tacGiaRepo.findAll()) {
            authors.add(new TacGiaDTO(i.getMatacgia(), i.getTentacgia()));
        }

        for (var i : theloaiRepo.findAll()) {
            categories.add(new TheLoaiDTO(i.getMatheloai(), i.getTentheloai()));
        }

        for (var i : nhaXuatBanRepo.findAll()) {
            publishers.add(new NhaXuatBanDTO(i.getManxb(), i.getTennxb()));
        }

        return new BookInfoDTO(authors, categories, publishers);
    }

}
