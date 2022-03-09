package com.rsg.service;

import com.rsg.data.Product;
import com.rsg.dto.ProductData;
import com.rsg.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service("ProductService")
public class DefaultProductService implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    /**
     * Create a Product based on the data sent to the service class.
     * @param Product
     * @return DTO representation of the Product
     */
    @Override
    public ProductData saveProduct(ProductData Product) {
        Product ProductModel = populateProductEntity(Product);
        return populateProductData(productRepository.save(ProductModel));
    }

    /**
     * Delete Product based on the Product ID.We can also use other option to delete Product
     * based on the entoty (passing JPA entity class as method parameter)
     * @param ProductId
     * @return boolean flag indicating the request status
     */
    @Override
    public boolean deleteProduct(Long ProductId) {
        productRepository.deleteById(ProductId);
        return true;
    }

    /**
     * Method to return list of all the available Products in the system.This is a simple
     * implementation but you might want to use pagination in the real world example.
     * @return list of Product
     */
    @Override
    public List<ProductData> getAllProducts() {
        List<ProductData> Products = new ArrayList<>();
        List<Product> ProductList = productRepository.findAll();
        ProductList.forEach(Product -> {
            Products.add(populateProductData(Product));
        });
        return Products;
    }

    /**
     * Get Product by ID.The service will send the Product data else will throw the exception.
     * @param ProductId
     * @return ProductData
     */
    @Override
    public ProductData getProductById(Long ProductId) {
        return populateProductData( productRepository.findById(ProductId).orElseThrow(() -> new EntityNotFoundException("Product not found")));
    }

    /**
     * Internal method to convert Product JPA entity to the DTO object
     * for frontend data
     * @param Product
     * @return ProductData
     */
    private ProductData populateProductData(final Product Product){
        ProductData ProductData = new ProductData();
        ProductData.setId(Product.getId());
        ProductData.set_Id(Product.get_Id());
        ProductData.setName(Product.getName());
        ProductData.setSmall_image(Product.getSmall_image());
        ProductData.setDescription(Product.getDescription());
        ProductData.setRetail_price(Product.getRetail_price());
        ProductData.setSale_price(Product.getSale_price());
        ProductData.setSkuid(Product.getSkuid());

        return  ProductData;
    }

    /**
     * Method to map the frontend Product object to the JPA Product entity.
     * @param ProductData
     * @return Product
     */
    private Product populateProductEntity(ProductData ProductData){
        Product Product = new Product();
        Product.setName(ProductData.getName());
        Product.set_Id(ProductData.get_Id());
        Product.setSmall_image(ProductData.getSmall_image());
        ProductData.setDescription(Product.getDescription());
        ProductData.setRetail_price(Product.getRetail_price());
        ProductData.setSale_price(Product.getSale_price());
        ProductData.setSkuid(Product.getSkuid());
        return  Product;
    }
}
