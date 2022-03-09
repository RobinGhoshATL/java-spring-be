package com.rsg.controller;

import com.rsg.dto.ProductData;
import com.rsg.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api")

public class ProductController {

    @Resource(name = "ProductService")
    private ProductService productService;

    /**
     * <p>Get all Product data in the system.For production system you many want to use
     * pagination.</p>
     * @return List<ProductData>
     */
    @GetMapping("/products")
    public List<ProductData> getProducts(){
        return productService.getAllProducts();
    }

    /**
     * Method to get the Product data based on the ID.
     * @param id
     * @return ProductData
     */
    @GetMapping("/product/{id}")
    public ProductData getProduct(@PathVariable Long id){
        return productService.getProductById(id);
    }

    /**
     * Post request to create Product information int the system.
     * @param ProductData
     * @return
     */
    @PostMapping("/product")
    public ProductData saveProduct(final @RequestBody ProductData ProductData){
        return productService.saveProduct(ProductData);
    }

    /**
     * Delete Product from the system based on the ID. The method mapping is similar to the getProduct with difference of
     * @DeleteMapping and @GetMapping
     * @param id
     * @return
     */
    @DeleteMapping("/product/{id}")
    public Boolean deleteProduct(@PathVariable Long id){
        return productService.deleteProduct(id);
    }

}
