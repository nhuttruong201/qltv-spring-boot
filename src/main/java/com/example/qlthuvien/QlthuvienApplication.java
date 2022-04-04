package com.example.qlthuvien;

import java.util.List;

import com.example.qlthuvien.entity.NhaXuatBan;
import com.example.qlthuvien.repository.NhaXuatBanRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class QlthuvienApplication implements CommandLineRunner {
	@Autowired
	private NhaXuatBanRepo nhaXuatBanRepo;

	public static void main(String[] args) {
		SpringApplication.run(QlthuvienApplication.class, args);
		System.out.println("\n>>> Server is running on port 5000");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("___________________________________________________________________");
		System.out.println("---------------------  NHÀ XUẤT BẢN  ------------------------------");
		List<NhaXuatBan> nhaXuatBanEntityList = nhaXuatBanRepo.findAll();
		nhaXuatBanEntityList.forEach(System.out::println);

	}

}
