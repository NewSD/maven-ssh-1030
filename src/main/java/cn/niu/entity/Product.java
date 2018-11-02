package cn.niu.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer productID;
    private String productName;
    private BigDecimal price;
    private Integer categoryID;


}