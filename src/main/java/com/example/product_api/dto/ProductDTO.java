package com.example.product_api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductDTO {
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    
    // ✅ SATU SET GETTER/SETTER SAJA - NO DUPLICATE
    @NotBlank(message = "Name is required")
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @NotBlank(message = "Description is required")
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @NotNull(message = "Price is required")
    @Min(value = 0, message = "Price must be greater than 0")
    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    @NotNull(message = "Stock is required")
    @Min(value = 0, message = "Stock must be greater than 0")
    public Integer getStock() {
        return stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }
}