package com.example.qlthuvien.services;

import java.util.ArrayList;
import java.util.List;

import com.example.qlthuvien.dto.BookInfoDTO;
import com.example.qlthuvien.dto.NhaXuatBanDTO;
import com.example.qlthuvien.dto.SachDTO;
import com.example.qlthuvien.dto.TacGiaDTO;
import com.example.qlthuvien.dto.TheLoaiDTO;
import com.example.qlthuvien.repository.NhaXuatBanRepo;
import com.example.qlthuvien.repository.SachRepo;
import com.example.qlthuvien.repository.TacGiaRepo;
import com.example.qlthuvien.repository.TheloaiRepo;

public class SachService {

    public static List<SachDTO> getAllBook(SachRepo sachRepo) {
        List<SachDTO> sachDTOs = new ArrayList<>();
        for (var i : sachRepo.findAll()) {
            sachDTOs.add(new SachDTO(i.getMasach(), i.getTensach(), i.getSoluong(),
                    i.getNamxuatban(),
                    new TacGiaDTO(i.getTacGiaEntity().getMatacgia(), i.getTacGiaEntity().getTentacgia()),
                    new TheLoaiDTO(i.getTheLoaiEntity().getMatheloai(), i.getTheLoaiEntity().getTentheloai()),
                    new NhaXuatBanDTO(i.getNhaXuatBanEntity().getManxb(), i.getNhaXuatBanEntity().getTennxb())));
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
