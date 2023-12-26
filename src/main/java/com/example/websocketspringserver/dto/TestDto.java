package com.example.websocketspringserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
@Data
public class TestDto {
    private String from;
    private String message;
}
