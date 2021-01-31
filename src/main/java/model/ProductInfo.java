package model;

import entity.*;
import lombok.Data;

@Data
public class ProductInfo {

    private String code;
    private String name;
    private double price;
    private String productCategory;
    private String description;
    private String specification;

    public ProductInfo() {
    }

    public ProductInfo(Product product, ProductDetails productDetails) {
        this.code = product.getCode();
        this.name = product.getName();
        this.price = product.getPrice();
        this.productCategory = product.getProductCategory();
        this.description = productDetails.getDescription();
        this.specification = productDetails.getSpecification();
    }

    // Using in JPA/Hibernate query
    public ProductInfo(String code, String name, double price, String productCategory, String description, String specification) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
        this.description = description;
        this.specification = specification;
    }
}
