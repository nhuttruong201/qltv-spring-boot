package com.example.qlthuvien.controller;

import java.util.List;

import com.example.qlthuvien.dto.NhanVienDTO;
import com.example.qlthuvien.dto.ThemNhanVienDTO;
import com.example.qlthuvien.entity.NhanVienEntity;
import com.example.qlthuvien.repository.ChucVuRepo;
import com.example.qlthuvien.repository.NhanVienRepo;
import com.example.qlthuvien.services.NhanVienService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/staffs")
public class StaffController {
    @Autowired
    private NhanVienRepo nhanVienRepo;

    @Autowired
    private ChucVuRepo chucVuRepo;

    @GetMapping("")
    public ResponseEntity<?> getAllStaffs(@RequestHeader(value = "username", defaultValue = "null") String username) {
        System.out.println(">> check header: " + username);

        List<NhanVienDTO> nhanVienDTO = NhanVienService.getAllStaffs(nhanVienRepo);

        return ResponseEntity.ok(nhanVienDTO);
    }

    @GetMapping("/staff-info")
    public ResponseEntity<?> getInfoStaff(@RequestHeader(value = "username", defaultValue = "null") String username) {
        return ResponseEntity.ok(NhanVienService.getStaffInfo(chucVuRepo));
    }

    @PostMapping("/add-new")
    public ResponseEntity<?> addNewStaff(@RequestHeader(value = "username", defaultValue = "null") String username,
            @RequestBody ThemNhanVienDTO themNhanVienDTO) {

        System.out.println(themNhanVienDTO.toString());

        NhanVienEntity newStaff = new NhanVienEntity();

        newStaff.setEmail(themNhanVienDTO.getEmail());
        newStaff.setMatkhau(themNhanVienDTO.getMatkhau());
        newStaff.setHoten(themNhanVienDTO.getHoten());
        newStaff.setGioitinh(themNhanVienDTO.getGioitinh());
        newStaff.setSdt(themNhanVienDTO.getSdt());
        newStaff.setDiachi(themNhanVienDTO.getDiachi());
        newStaff.setChucVuEntity(chucVuRepo.findById(themNhanVienDTO.getMachucvu()));

        System.out.println("new staff: " + newStaff.toString());

        // * lưu sách mới
        newStaff = nhanVienRepo.save(newStaff);
        System.out.println(">>> check Staff: " + newStaff);

        return ResponseEntity.ok(NhanVienService.getAllStaffs(nhanVienRepo));
    }

    @PostMapping("/edit-staff")
    public ResponseEntity<?> editBook(@RequestHeader(value = "username", defaultValue = "null") String username,
            @RequestBody ThemNhanVienDTO themNhanVienDTO) {

        System.out.println(themNhanVienDTO.toString());

        NhanVienEntity editStaff = new NhanVienEntity();
        editStaff.setManhanvien(themNhanVienDTO.getManhanvien());
        editStaff.setEmail(themNhanVienDTO.getEmail());
        editStaff.setMatkhau(themNhanVienDTO.getMatkhau());
        editStaff.setHoten(themNhanVienDTO.getHoten());
        editStaff.setGioitinh(themNhanVienDTO.getGioitinh());
        editStaff.setNamsinh(themNhanVienDTO.getNamsinh());
        editStaff.setSdt(themNhanVienDTO.getSdt());
        editStaff.setDiachi(themNhanVienDTO.getDiachi());
        editStaff.setDabikhoa(themNhanVienDTO.getDabikhoa());
        editStaff.setChucVuEntity(chucVuRepo.findById(themNhanVienDTO.getMachucvu()));

        nhanVienRepo.save(editStaff);

        return ResponseEntity.ok(NhanVienService.getAllStaffs(nhanVienRepo));
    }
}
