package com.javadev.exportdatatoexcel.controller;

import com.javadev.exportdatatoexcel.dto.ResponseDto;
import com.javadev.exportdatatoexcel.dto.UserRequest;
import com.javadev.exportdatatoexcel.entity.User;
import com.javadev.exportdatatoexcel.generator.ExcelGenerator;
import com.javadev.exportdatatoexcel.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class ExcelController {
    @Autowired
    private UserService userService;





    @GetMapping("/export-to-excel")
    public void exportIntoExcelFile(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=student" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);

        List<User> listOfUsers= userService.getTheUsersList();
        ExcelGenerator generator = new ExcelGenerator(listOfUsers);
        generator.generateExcelFile(response);
    }
}
