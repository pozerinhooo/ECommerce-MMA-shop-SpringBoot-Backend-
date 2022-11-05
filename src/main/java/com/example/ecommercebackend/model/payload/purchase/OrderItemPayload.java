package com.example.ecommercebackend.model.payload.purchase;

import com.example.ecommercebackend.model.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class OrderItemPayload {
    @NotBlank(message = "Item's name is required")
    private String name;
    @NotBlank(message = "Item's size is required")
    private String size;
    @NotBlank(message = "Item's brand name is required")
    private String brandName;
    @NotBlank(message = "Item's price is required")
    private BigDecimal price;
    private String imagePath;
    @NotBlank(message = "Items quantity is required")
    private int amount;
    @NotBlank(message = "Product id is required")
    private Long productId;
}
