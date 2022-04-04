package com.example.qlthuvien;

import java.util.List;

import com.example.qlthuvien.entity.ChucVuEntity;
import com.example.qlthuvien.entity.TacGiaEntity;
import com.example.qlthuvien.entity.TacGiaSachEntity;
import com.example.qlthuvien.entity.TheDocGiaEntity;
import com.example.qlthuvien.entity.TheLoaiEntity;

import com.example.qlthuvien.repository.ChucVuRepo;
import com.example.qlthuvien.repository.TacGiaRepo;
import com.example.qlthuvien.repository.TacGiaSachRepo;
import com.example.qlthuvien.repository.TheDocGiaRepo;
import com.example.qlthuvien.repository.TheloaiRepo;

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
	private TacGiaRepo tacGiaRepo;
	@Autowired
	private TacGiaSachRepo tacGiaSachRepo;
	@Autowired
	private TheDocGiaRepo theDocGiaRepo;
	@Autowired
	private TheloaiRepo theLoaiRepo;

	public static void main(String[] args) {
		System.out.println(PURPLE);
		SpringApplication.run(QlthuvienApplication.class, args);
		System.out.println("\n>>> Server is running on port 5000");

	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("___________________________________________________________________");
		System.out.println("___________________________________________________________________");

		List<ChucVuEntity> chucVuEntities = chucVuRepo.findAll();
		chucVuEntities.forEach(System.out::println);

		System.out.println("___________________________________________________________________");
		System.out.println("___________________________________________________________________");

		List<TacGiaEntity> tacGiaEntities = tacGiaRepo.findAll();
		tacGiaEntities.forEach(System.out::println);

		System.out.println("___________________________________________________________________");
		System.out.println("___________________________________________________________________");

		List<TacGiaSachEntity> tacGiaSachEntities = tacGiaSachRepo.findAll();
		tacGiaSachEntities.forEach(System.out::println);

		System.out.println("___________________________________________________________________");
		System.out.println("___________________________________________________________________");

		List<TheDocGiaEntity> theDocGiaEntities = theDocGiaRepo.findAll();
		theDocGiaEntities.forEach(System.out::println);

		System.out.println("___________________________________________________________________");
		System.out.println("___________________________________________________________________");

		List<TheLoaiEntity> theLoaiEntities = theLoaiRepo.findAll();
		theLoaiEntities.forEach(System.out::println);

	}

}
