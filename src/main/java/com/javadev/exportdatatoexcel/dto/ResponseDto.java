package com.javadev.exportdatatoexcel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto <T> implements Serializable {

    private String message;

    private String statusCode;

    private T data;
}
