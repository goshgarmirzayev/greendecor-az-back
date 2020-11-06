package com.goshgarmirzayev.controller;

import com.goshgarmirzayev.reponse.ApiResponse;
import com.goshgarmirzayev.service.ProductService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @Get(value = "/")
    public ApiResponse getAllProducts(){
        return productService.getAllProducts();
    }


}
