package com.example.qlthuvien.services;

import java.util.ArrayList;
import java.util.List;

import com.example.qlthuvien.dto.ChucVuDTO;
import com.example.qlthuvien.dto.NhanVienDTO;
import com.example.qlthuvien.dto.StaffInfoDTO;
import com.example.qlthuvien.repository.ChucVuRepo;
import com.example.qlthuvien.repository.NhanVienRepo;

public class NhanVienService {

    public static List<NhanVienDTO> getAllStaffs(NhanVienRepo nhanVienRepo) {
        List<NhanVienDTO> nhanVienDTOs = new ArrayList<>();
        for (var i : nhanVienRepo.findAll()) {
            nhanVienDTOs
                    .add(new NhanVienDTO(i.getManhanvien(), i.getEmail(), i.getMatkhau(), i.getHoten(), i.isGioitinh(),
                            i.getNamsinh(), i.getSdt(), i.getDiachi(), i.isDabikhoa(), i.getNgaytao(), i.getNgaysua(),
                            new ChucVuDTO(i.getChucVuEntity().getMachucvu(), i.getChucVuEntity().getTenchucvu())));
        }
        return nhanVienDTOs;
    };

    public static StaffInfoDTO getStaffInfo(ChucVuRepo chucVuRepo) {
        List<ChucVuDTO> positions = new ArrayList<>();
        for (var i : chucVuRepo.findAll()) {
            positions.add(new ChucVuDTO(i.getMachucvu(), i.getTenchucvu()));
        }

        return new StaffInfoDTO(positions);
    }
}
