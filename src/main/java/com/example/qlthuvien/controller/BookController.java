package com.example.qlthuvien.controller;

import java.util.List;

import com.example.qlthuvien.dto.SachDTO;
import com.example.qlthuvien.dto.ThemSachDTO;
import com.example.qlthuvien.entity.SachEntity;
import com.example.qlthuvien.repository.NhaXuatBanRepo;
import com.example.qlthuvien.repository.SachRepo;
import com.example.qlthuvien.repository.TacGiaRepo;
import com.example.qlthuvien.repository.TheloaiRepo;
import com.example.qlthuvien.services.SachService;
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
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private SachRepo sachRepo;
    @Autowired
    private TacGiaRepo tacGiaRepo;
    @Autowired
    private TheloaiRepo theloaiRepo;
    @Autowired
    private NhaXuatBanRepo nhaXuatBanRepo;

    @GetMapping("")
    public ResponseEntity<?> getAllBook(@RequestHeader(value = "username", defaultValue = "null") String username) {
        System.out.println(">> check header: " + username);

        List<SachDTO> sachDTOs = SachService.getAllBook(sachRepo);
        return ResponseEntity.ok(sachDTOs);
    }

    @GetMapping("/book-info")
    public ResponseEntity<?> getInfoABook(@RequestHeader(value = "username", defaultValue = "null") String username) {
        return ResponseEntity.ok(SachService.getBookInfo(tacGiaRepo, theloaiRepo, nhaXuatBanRepo));
    }

    @PostMapping("/add-new")
    public ResponseEntity<?> addNewBook(@RequestHeader(value = "username", defaultValue = "null") String username,
            @RequestBody ThemSachDTO themSachDTO) {

        System.out.println(themSachDTO.toString());

        SachEntity newBook = new SachEntity();

        newBook.setTensach(themSachDTO.getTensach());
        newBook.setTacGiaEntity(tacGiaRepo.findById(themSachDTO.getMatacgia()));
        newBook.setTheLoaiEntity(theloaiRepo.findById(themSachDTO.getMatheloai()));
        newBook.setNhaXuatBanEntity(nhaXuatBanRepo.findById(themSachDTO.getManxb()));
        newBook.setNamxuatban(themSachDTO.getNamxuatban());
        newBook.setSoluong(themSachDTO.getSoluong());

        System.out.println("new book: " + newBook.toString());

        // * lưu sách mới
        newBook = sachRepo.save(newBook);
        System.out.println(">>> check bookSave: " + newBook);

        return ResponseEntity.ok(SachService.getAllBook(sachRepo));
    }

    @PostMapping("/edit-book")
    public ResponseEntity<?> editBook(@RequestHeader(value = "username", defaultValue = "null") String username,
            @RequestBody ThemSachDTO themSachDTO) {

        System.out.println(themSachDTO.toString());

        SachEntity editBook = new SachEntity();
        editBook.setMasach(themSachDTO.getMasach());
        editBook.setTensach(themSachDTO.getTensach());
        editBook.setTacGiaEntity(tacGiaRepo.findById(themSachDTO.getMatacgia()));
        editBook.setTheLoaiEntity(theloaiRepo.findById(themSachDTO.getMatheloai()));
        editBook.setNhaXuatBanEntity(nhaXuatBanRepo.findById(themSachDTO.getManxb()));
        editBook.setNamxuatban(themSachDTO.getNamxuatban());
        editBook.setSoluong(themSachDTO.getSoluong());

        sachRepo.save(editBook);

        return ResponseEntity.ok(SachService.getAllBook(sachRepo));
    }

}
