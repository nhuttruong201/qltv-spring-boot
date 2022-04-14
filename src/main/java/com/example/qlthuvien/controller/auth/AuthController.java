package com.example.qlthuvien.controller.auth;

import com.example.qlthuvien.dto.NhanVienDTO;
import com.example.qlthuvien.entity.NhanVienEntity;
import com.example.qlthuvien.repository.NhanVienRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/auth/")
public class AuthController {
    @Autowired
    private NhanVienRepo nhanVienRepo;

    @PostMapping("get-user-info")
    public ResponseEntity<?> getUserInfoByUserName(@RequestBody NhanVienDTO nhanVienDTO) {

        NhanVienEntity userInfo = nhanVienRepo.findByEmail(nhanVienDTO.getEmail());

        return ResponseEntity.ok(userInfo);
    }
}
