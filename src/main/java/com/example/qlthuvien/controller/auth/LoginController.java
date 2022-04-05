package com.example.qlthuvien.controller.auth;

import java.util.List;

import com.example.qlthuvien.customs.CustomLoginResponse;
import com.example.qlthuvien.dto.NhanVienDTO;
import com.example.qlthuvien.entity.NhanVienEntity;
import com.example.qlthuvien.repository.NhanVienRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {

    @Autowired
    private NhanVienRepo nhanVienRepo;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody NhanVienDTO nhanVienDTO) {

        String emailLogin = nhanVienDTO.getEmail();
        String matkhauLogin = nhanVienDTO.getMatkhau();

        // * gán tạm trạng thái login fail
        CustomLoginResponse customLoginResponse = new CustomLoginResponse(400, "Bad Request", nhanVienDTO, null);

        List<NhanVienEntity> nhanVienEntities = nhanVienRepo.findAll();
        for (NhanVienEntity i : nhanVienEntities) {
            if (i.getEmail().equals(emailLogin) && i.getMatkhau().equals(matkhauLogin)) {
                // todo: check tài khoản bí khóa
                NhanVienEntity nhanVienCheck = nhanVienRepo.findByEmail(emailLogin);
                if (nhanVienCheck.isDabikhoa()) {
                    customLoginResponse = new CustomLoginResponse(403, "Forbidden", nhanVienDTO, null);
                } else {
                    // todo login ok
                    customLoginResponse = new CustomLoginResponse(200, "Ok", nhanVienDTO, nhanVienCheck);
                }
                break;
            }
        }

        return ResponseEntity.ok(customLoginResponse);
    }
}
