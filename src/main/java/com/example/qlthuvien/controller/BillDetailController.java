package com.example.qlthuvien.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.qlthuvien.dto.ChiTietPhieuMuonDTO;
import com.example.qlthuvien.dto.SachDTO;
import com.example.qlthuvien.entity.CTPhieuMuonEntity;
import com.example.qlthuvien.entity.PhieuMuonEntity;
import com.example.qlthuvien.repository.CTPhieuMuonRepo;
import com.example.qlthuvien.repository.PhieuMuonRepo;
import com.example.qlthuvien.repository.SachRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/bill-detail")
public class BillDetailController {
    @Autowired
    private PhieuMuonRepo phieuMuonRepo;
    @Autowired
    private CTPhieuMuonRepo ctPhieuMuonRepo;
    @Autowired
    private SachRepo sachRepo;

    @GetMapping("/wait-pay/{readerId}")
    public ResponseEntity<?> createBill(@RequestHeader(value = "username", defaultValue = "null") String username,
            @PathVariable(name = "readerId") int readerId) {

        PhieuMuonEntity bill = phieuMuonRepo.findByMatheAndDathanhtoan(readerId, false);
        List<CTPhieuMuonEntity> billDetails = ctPhieuMuonRepo.findByMaphieumuon(bill.getMaphieumuon());

        List<ChiTietPhieuMuonDTO> chiTietPhieuMuonDTOs = new ArrayList<>();
        for (var item : billDetails) {
            ChiTietPhieuMuonDTO temp = new ChiTietPhieuMuonDTO();
            temp.setMaphieumuon(bill.getMaphieumuon());
            temp.setTensach(sachRepo.findById(item.getMasach()).getTensach());
            temp.setSoluong(item.getSoluong());
            temp.setNgaymuon(bill.getNgaymuon());
            temp.setHantra(bill.getHantra());

            chiTietPhieuMuonDTOs.add(temp);
        }

        return ResponseEntity.ok(chiTietPhieuMuonDTOs);
    }

    @GetMapping("/{billId}")
    public ResponseEntity<?> getBillDetailByBillId(
            @RequestHeader(value = "username", defaultValue = "null") String username,
            @PathVariable(name = "billId") int billId) {

        PhieuMuonEntity bill = phieuMuonRepo.findById(billId);
        List<CTPhieuMuonEntity> billDetails = ctPhieuMuonRepo.findByMaphieumuon(billId);
        List<ChiTietPhieuMuonDTO> chiTietPhieuMuonDTOs = new ArrayList<>();
        for (var item : billDetails) {
            ChiTietPhieuMuonDTO temp = new ChiTietPhieuMuonDTO();
            temp.setMaphieumuon(bill.getMaphieumuon());
            temp.setTensach(sachRepo.findById(item.getMasach()).getTensach());
            temp.setSoluong(item.getSoluong());
            temp.setNgaymuon(bill.getNgaymuon());
            temp.setHantra(bill.getHantra());
            temp.setNgaytra(bill.getNgaytra());
            temp.setDathanhtoan(bill.isDathanhtoan());

            chiTietPhieuMuonDTOs.add(temp);
        }

        return ResponseEntity.ok(chiTietPhieuMuonDTOs);
    }

}

// private int maphieumuon;
// private String tensach;
// private int soluong;
// private Date ngaymuon;
// private Date hantra;
