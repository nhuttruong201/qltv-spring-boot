package com.example.qlthuvien.controller;

import com.example.qlthuvien.repository.TacGiaRepo;

import java.util.ArrayList;
import java.util.List;

import com.example.qlthuvien.entity.TacGiaEntity;
import com.example.qlthuvien.dto.TacGiaDTO;
import com.example.qlthuvien.services.TacGiaService;
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
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    private TacGiaRepo tacGiaRepo;

    @GetMapping("")
    public ResponseEntity<?> getAllAuthor(@RequestHeader(value = "username", defaultValue = "null") String username) {
        List<TacGiaDTO> tacGiaDTOs = TacGiaService.getAllAuthor(tacGiaRepo);
        return ResponseEntity.ok(tacGiaDTOs);
    }

    @PostMapping("/add-new")
    public ResponseEntity<?> addNewAuthor(@RequestHeader(value = "username", defaultValue = "null") String username,
            @RequestBody TacGiaDTO tacGiaDTO) {
        System.out.println(tacGiaDTO.toString());

        TacGiaEntity newAuthor = new TacGiaEntity();

        newAuthor.setMatacgia(tacGiaDTO.getMatacgia());
        newAuthor.setTentacgia(tacGiaDTO.getTentacgia());

        System.out.println("new author:" + newAuthor.toString());
        // Lưu tác giả mới vào database
        newAuthor = tacGiaRepo.save(newAuthor);
        System.out.println("check new Author" + newAuthor);
        return ResponseEntity.ok(TacGiaService.getAllAuthor(tacGiaRepo));
    }

    @PostMapping("/edit-author")
    public ResponseEntity<?> editBook(@RequestHeader(value = "username", defaultValue = "null") String username,
            @RequestBody TacGiaDTO tacGiaDTO) {

        TacGiaEntity editTacGia = new TacGiaEntity();
        editTacGia.setMatacgia(tacGiaDTO.getMatacgia());
        editTacGia.setTentacgia(tacGiaDTO.getTentacgia());

        tacGiaRepo.save(editTacGia);

        return ResponseEntity.ok(TacGiaService.getAllAuthor(tacGiaRepo));
    }
}
