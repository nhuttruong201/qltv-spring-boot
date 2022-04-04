package com.example.qlthuvien;

import java.util.List;

import com.example.qlthuvien.entity.CTPhieuMuonEntity;
import com.example.qlthuvien.entity.ChucVuEntity;
import com.example.qlthuvien.entity.NhaXuatBanEntity;
import com.example.qlthuvien.entity.NhanVienEntity;
import com.example.qlthuvien.entity.PhieuMuonEntity;
import com.example.qlthuvien.repository.CTPhieuMuonRepo;
import com.example.qlthuvien.repository.ChucVuRepo;
import com.example.qlthuvien.repository.NhaXuatBanRepo;
import com.example.qlthuvien.repository.NhanVienRepo;
import com.example.qlthuvien.repository.PhieuMuonRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class QlthuvienApplication implements CommandLineRunner {
	public static final String PURPLE = "\033[0;35m"; // PURPLE

	@Autowired
	private ChucVuRepo chucVuRepo;
	@Autowired
	private CTPhieuMuonRepo ctPhieuMuonRepo;
	@Autowired
	private NhanVienRepo nhanVienRepo;
	@Autowired
	private NhaXuatBanRepo nhaXuatBanRepo;
	@Autowired
	private PhieuMuonRepo phieuMuonRepo;

	public static void main(String[] args) {
		System.out.println(PURPLE);
		SpringApplication.run(QlthuvienApplication.class, args);
		System.out.println("\n>>> Server is running on port 5000");

	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("___________________________________________________________________");

		List<ChucVuEntity> chucVuEntities = chucVuRepo.findAll();
		chucVuEntities.forEach(System.out::println);

		System.out.println("___________________________________________________________________");
		List<CTPhieuMuonEntity> ctPhieuMuonEntities = ctPhieuMuonRepo.findAll();
		ctPhieuMuonEntities.forEach(System.out::println);

		System.out.println("___________________________________________________________________");
		List<NhanVienEntity> nhanVienEntities = nhanVienRepo.findAll();
		nhanVienEntities.forEach(System.out::println);

		System.out.println("___________________________________________________________________");
		List<NhaXuatBanEntity> nhaXuatBanEntities = nhaXuatBanRepo.findAll();
		nhaXuatBanEntities.forEach(System.out::println);

		System.out.println("___________________________________________________________________");
		List<PhieuMuonEntity> phieuMuonEntities = phieuMuonRepo.findAll();
		phieuMuonEntities.forEach(System.out::println);
	}

}
