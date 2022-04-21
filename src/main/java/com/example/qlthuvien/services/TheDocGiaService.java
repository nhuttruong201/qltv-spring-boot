package com.example.qlthuvien.services;

import java.util.List;
import java.util.ArrayList;

import com.example.qlthuvien.dto.TheDocGiaDTO;
import com.example.qlthuvien.repository.TheDocGiaRepo;

// mathe;
// dabikhoa;
// ngaylamthe;
// ngayhethan;
// hoten;
// gioitinh;
// sdt;
// diachi;
// cccd;

public class TheDocGiaService {

    public static List<TheDocGiaDTO> getAllReaders(TheDocGiaRepo theDocGiaRepo) {
        List<TheDocGiaDTO> theDocGiaDTOs = new ArrayList<>();
        for (var i : theDocGiaRepo.findAll()) {
            theDocGiaDTOs.add(new TheDocGiaDTO(i.getMathe(), i.isDabikhoa(), i.getNgaylamthe(), i.getNgayhethan(),
                    i.getHoten(), i.isGioitinh(), i.getSdt(), i.getDiachi(), i.getCccd()));
        }
        return theDocGiaDTOs;
    };

}
