package com.example.qlthuvien.controller;

import java.util.List;
import com.example.qlthuvien.dto.SachDTO;
import com.example.qlthuvien.repository.SachRepo;
import com.example.qlthuvien.services.SachService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private SachRepo sachRepo;

    @GetMapping("")
    public ResponseEntity<?> getAllBook(@RequestHeader(value = "username", defaultValue = "null") String username) {
        System.out.println(">> check header: " + username);

        List<SachDTO> sachDTOs = SachService.getAllBook(sachRepo);
        return ResponseEntity.ok(sachDTOs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(id);
    }

}
