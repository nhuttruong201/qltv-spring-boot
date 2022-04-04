package com.example.qlthuvien;

import java.util.List;

import com.example.qlthuvien.entity.ChucVuEntity;
import com.example.qlthuvien.repository.ChucVuRepo;

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

	}

}