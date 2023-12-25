package com.example.websocketspringserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class InnerDto {
    private String innerName;
    private List<String> innerList;
}
