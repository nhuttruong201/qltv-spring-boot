package com.example.qlthuvien.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import com.example.qlthuvien.dto.PhieuMuonDTO;
import com.example.qlthuvien.entity.CTPhieuMuonEntity;
import com.example.qlthuvien.entity.PhieuMuonEntity;
import com.example.qlthuvien.entity.TheDocGiaEntity;
import com.example.qlthuvien.repository.CTPhieuMuonRepo;
import com.example.qlthuvien.repository.PhieuMuonRepo;
import com.example.qlthuvien.repository.TheDocGiaRepo;

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
@RequestMapping("/api/bills")
public class BillController {
    @Autowired
    private PhieuMuonRepo phieuMuonRepo;
    @Autowired
    private CTPhieuMuonRepo ctPhieuMuonRepo;
    @Autowired
    private TheDocGiaRepo theDocGiaRepo;

    @GetMapping("")
    public ResponseEntity<?> getAllBills(@RequestHeader(value = "username", defaultValue = "null") String username) {
        List<PhieuMuonEntity> listBills = phieuMuonRepo.findAll();
        return ResponseEntity.ok(listBills);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createBill(@RequestHeader(value = "username", defaultValue = "null") String username,
            @RequestBody PhieuMuonDTO phieuMuonDTO) {

        Date ngaymuon = Date.valueOf(LocalDate.now());
        Date hantra = Date.valueOf(LocalDate.now().plusDays(7)); // sau ngày mượn 7 ngày

        PhieuMuonEntity newBill = new PhieuMuonEntity();
        newBill.setMathe(phieuMuonDTO.getMathe());
        newBill.setManhanvien(phieuMuonDTO.getManhanvien());
        newBill.setDathanhtoan(false);
        newBill.setNgaymuon(ngaymuon);
        newBill.setNgaytra(null);
        newBill.setHantra(hantra);

        // todo lưu phiếu mượn
        newBill = phieuMuonRepo.save(newBill);
        System.out.println("\n\n>>> Check Bill saved: " + newBill);

        // todo cập nhật trạng thái đang mượn cho thẻ độc giả
        TheDocGiaEntity currentReader = theDocGiaRepo.findById(phieuMuonDTO.getMathe());
        currentReader.setDangmuon(true);
        currentReader = theDocGiaRepo.save(currentReader);
        System.out.println("\n\n>> check reader: " + currentReader);

        // todo lưu chi tiết phiếu mượn
        String[] billArray = phieuMuonDTO.getBillInfo().split("-");
        System.out.println("\n\n>>> check bill info: ");
        for (String s : billArray) {
            // System.out.println(s);
            String[] row = s.split("@");
            System.out.println("Ma sach: " + row[0] + ", SL: " + row[1]);
            // lưu ct phiếu mượn
            CTPhieuMuonEntity newBillDetail = new CTPhieuMuonEntity();
            newBillDetail.setMaphieumuon(newBill.getMaphieumuon());
            newBillDetail.setMasach(Integer.parseInt(row[0]));
            newBillDetail.setSoluong(Integer.parseInt(row[1]));

            ctPhieuMuonRepo.save(newBillDetail);
        }

        return ResponseEntity.ok("succeed");
    }

    @PostMapping("/pay")
    public ResponseEntity<?> payBill(@RequestHeader(value = "username", defaultValue = "null") String username,
            @RequestBody PhieuMuonDTO phieuMuonDTO) {

        int billId = phieuMuonDTO.getMaphieumuon();
        Date ngaytra = Date.valueOf(LocalDate.now());

        PhieuMuonEntity billPay = phieuMuonRepo.findById(billId);
        billPay.setDathanhtoan(true);
        billPay.setNgaytra(ngaytra);
        phieuMuonRepo.save(billPay);

        // todo cập nhật trạng thái đang mượn cho thẻ độc giả
        TheDocGiaEntity currentReader = theDocGiaRepo.findById(phieuMuonDTO.getMathe());
        currentReader.setDangmuon(false);
        currentReader = theDocGiaRepo.save(currentReader);
        System.out.println("\n\n>> check reader: " + currentReader);

        return ResponseEntity.ok("succeed");
    }

}
