package com.example.qlthuvien.controller;

import com.example.qlthuvien.repository.NhaXuatBanRepo;

import java.util.ArrayList;
import java.util.List;

import com.example.qlthuvien.entity.NhaXuatBanEntity;
import com.example.qlthuvien.dto.NhaXuatBanDTO;
import com.example.qlthuvien.services.NhaXuatBanService;
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
@RequestMapping("/api/Publishers")
public class PublisherController {

    @Autowired
    private NhaXuatBanRepo nhaXuatBanRepo;

    @GetMapping("")
    public ResponseEntity<?> getAllPublisher(
            @RequestHeader(value = "username", defaultValue = "null") String username) {
        List<NhaXuatBanDTO> NhaXuatBanDTOs = NhaXuatBanService.getAllPublisher(nhaXuatBanRepo);
        return ResponseEntity.ok(NhaXuatBanDTOs);
    }

    @PostMapping("/add-new")
    public ResponseEntity<?> addNewPublisher(@RequestHeader(value = "username", defaultValue = "null") String username,
            @RequestBody NhaXuatBanDTO nhaXuatBanDTO) {
        System.out.println(nhaXuatBanDTO.toString());

        NhaXuatBanEntity newPublisher = new NhaXuatBanEntity();

        newPublisher.setManxb(nhaXuatBanDTO.getManxb());
        newPublisher.setTennxb(nhaXuatBanDTO.getTennxb());

        System.out.println("new Publisher:" + newPublisher.toString());
        // Lưu tác giả mới vào database
        newPublisher = nhaXuatBanRepo.save(newPublisher);
        System.out.println("check new Publisher" + newPublisher);
        return ResponseEntity.ok(NhaXuatBanService.getAllPublisher(nhaXuatBanRepo));
    }

    @PostMapping("/edit-Publisher")
    public ResponseEntity<?> editBook(@RequestHeader(value = "username", defaultValue = "null") String username,
            @RequestBody NhaXuatBanDTO NhaXuatBanDTO) {

        NhaXuatBanEntity editNhaXuatBan = new NhaXuatBanEntity();
        editNhaXuatBan.setManxb(NhaXuatBanDTO.getManxb());
        editNhaXuatBan.setTennxb(NhaXuatBanDTO.getTennxb());

        nhaXuatBanRepo.save(editNhaXuatBan);

        return ResponseEntity.ok(NhaXuatBanService.getAllPublisher(nhaXuatBanRepo));
    }
}
