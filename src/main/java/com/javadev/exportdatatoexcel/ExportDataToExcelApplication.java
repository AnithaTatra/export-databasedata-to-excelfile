package com.javadev.exportdatatoexcel;

import com.javadev.exportdatatoexcel.dto.UserRequest;
import com.javadev.exportdatatoexcel.entity.User;
import com.javadev.exportdatatoexcel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExportDataToExcelApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ExportDataToExcelApplication.class, args);
	}



	}

