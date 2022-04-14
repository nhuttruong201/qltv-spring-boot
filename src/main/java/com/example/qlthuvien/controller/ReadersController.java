package com.example.qlthuvien.controller;

import java.util.List;

import com.example.qlthuvien.dto.TheDocGiaDTO;
import com.example.qlthuvien.entity.TheDocGiaEntity;
import com.example.qlthuvien.repository.TheDocGiaRepo;
import com.example.qlthuvien.services.TheDocGiaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/readers")
public class ReadersController {

    @Autowired
    private TheDocGiaRepo theDocGiaRepo;

    @GetMapping("")
    public ResponseEntity<?> getAllReaders(@RequestHeader(value = "username", defaultValue = "null") String username) {
        System.out.println(">> check header: " + username);

        List<TheDocGiaDTO> theDocGiaDTO = TheDocGiaService.getAllReaders(theDocGiaRepo);

        return ResponseEntity.ok(theDocGiaDTO);

    }

    @PostMapping("/add-new")
    public ResponseEntity<?> addNewReaders(@RequestHeader(value = "username", defaultValue = "null") String username,
            @RequestBody TheDocGiaDTO TheDocGiaDTO) {
        // System.out.println(TheDocGiaDTO.toString());

        TheDocGiaEntity newReader = new TheDocGiaEntity();

        newReader.setDabikhoa(TheDocGiaDTO.getDabikhoa());
        newReader.setHoten(TheDocGiaDTO.getHoten());
        newReader.setGioitinh(TheDocGiaDTO.getGioitinh());
        newReader.setSdt(TheDocGiaDTO.getSdt());
        newReader.setDiachi(TheDocGiaDTO.getDiachi());
        newReader.setCccd(TheDocGiaDTO.getCccd());
        System.out.println(">>> check bookSave: " + newReader);
        newReader = theDocGiaRepo.save(newReader);
        return ResponseEntity.ok(TheDocGiaService.getAllReaders(theDocGiaRepo));
    }

    @PostMapping("/edit-reader")
    public ResponseEntity<?> updateReaders(
            @RequestHeader(value = "username", defaultValue = "null") String username,
            @RequestBody TheDocGiaDTO TheDocGiaDTO) {

        TheDocGiaEntity updateReader = new TheDocGiaEntity();
        updateReader.setDabikhoa(TheDocGiaDTO.getDabikhoa());
        updateReader.setMathe(TheDocGiaDTO.getMathe());
        updateReader.setHoten(TheDocGiaDTO.getHoten());
        updateReader.setGioitinh(TheDocGiaDTO.getGioitinh());
        updateReader.setSdt(TheDocGiaDTO.getSdt());
        updateReader.setDiachi(TheDocGiaDTO.getDiachi());
        updateReader.setCccd(TheDocGiaDTO.getCccd());

        theDocGiaRepo.save(updateReader);

        return ResponseEntity.ok(TheDocGiaService.getAllReaders(theDocGiaRepo));
    }

}
