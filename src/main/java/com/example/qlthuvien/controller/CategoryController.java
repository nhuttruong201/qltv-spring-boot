package com.example.qlthuvien.controller;

import com.example.qlthuvien.repository.TheloaiRepo;

import java.util.ArrayList;
import java.util.List;

import com.example.qlthuvien.entity.TheLoaiEntity;
import com.example.qlthuvien.dto.TheLoaiDTO;
import com.example.qlthuvien.services.TheLoaiService;
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
@RequestMapping("/api/Categories")
public class CategoryController {

    @Autowired
    private TheloaiRepo theLoaiRepo;

    @GetMapping("")
    public ResponseEntity<?> getAllCategory(@RequestHeader(value = "username", defaultValue = "null") String username) {
        List<TheLoaiDTO> theLoaiDTOs = TheLoaiService.getAllCategory(theLoaiRepo);
        return ResponseEntity.ok(theLoaiDTOs);
    }

    @PostMapping("/add-new")
    public ResponseEntity<?> addNewCategory(@RequestHeader(value = "username", defaultValue = "null") String username,
            @RequestBody TheLoaiDTO theLoaiDTO) {
        System.out.println(theLoaiDTO.toString());

        TheLoaiEntity newCategory = new TheLoaiEntity();

        newCategory.setMatheloai(theLoaiDTO.getMatheloai());
        newCategory.setTentheloai(theLoaiDTO.getTentheloai());

        System.out.println("new Category:" + newCategory.toString());
        // Lưu tác giả mới vào database
        newCategory = theLoaiRepo.save(newCategory);
        System.out.println("check new Category" + newCategory);
        return ResponseEntity.ok(TheLoaiService.getAllCategory(theLoaiRepo));
    }

    @PostMapping("/edit-Category")
    public ResponseEntity<?> editBook(@RequestHeader(value = "username", defaultValue = "null") String username,
            @RequestBody TheLoaiDTO theLoaiDTO) {

        TheLoaiEntity edittheLoai = new TheLoaiEntity();
        edittheLoai.setMatheloai(theLoaiDTO.getMatheloai());
        edittheLoai.setTentheloai(theLoaiDTO.getTentheloai());

        theLoaiRepo.save(edittheLoai);

        return ResponseEntity.ok(TheLoaiService.getAllCategory(theLoaiRepo));
    }
}
