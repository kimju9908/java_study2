package com.example.demo;

import com.example.demo.dao.EmpDAO;
import com.example.demo.vo.EmpVO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	private final EmpDAO dao;

    public DemoApplication(EmpDAO dao) {
        this.dao = dao;
    }

    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<EmpVO>  list = dao.empSelect();
	}
}
