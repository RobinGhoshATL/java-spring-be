package com.rsg.service;

import com.rsg.dto.ProductData;

import java.util.List;

public interface ProductService {

    ProductData saveProduct(ProductData product);
    boolean deleteProduct(final Long productId);
    List<ProductData> getAllProducts();
    ProductData getProductById(final Long productId);
}
