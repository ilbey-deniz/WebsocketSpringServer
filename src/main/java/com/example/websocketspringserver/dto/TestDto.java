package com.example.websocketspringserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;

@AllArgsConstructor
@Data
public class TestDto {
    private String name;
    private String message;
}
