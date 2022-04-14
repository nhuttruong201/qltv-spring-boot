package com.example.qlthuvien.controller;

import com.example.qlthuvien.entity.TheDocGiaEntity;
import com.example.qlthuvien.repository.TheDocGiaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/readers")
public class ReaderController {
    @Autowired
    private TheDocGiaRepo theDocGiaRepo;

    @GetMapping("/{id}")
    public ResponseEntity<?> getReaderById(@RequestHeader(value = "username", defaultValue = "null") String username,
            @PathVariable(name = "id") int id) {

        TheDocGiaEntity docgia = theDocGiaRepo.findById(id);

        System.out.println("\n\n>> getReaderById: " + docgia);

        return ResponseEntity.ok(docgia);
    }

}
