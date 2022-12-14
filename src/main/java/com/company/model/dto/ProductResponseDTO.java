package com.company.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDTO implements Serializable {
    private String name;
    private double price;
    private String description;
    private String categoryName;

}
