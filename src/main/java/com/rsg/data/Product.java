package com.rsg.data;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@EntityListeners(AuditingEntityListener.class)
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String _id;
    private String small_image;
    private String name;
    private String description;
    private String retail_price;
    private String sale_price;
    private String skuid;



/*
    @Column(updatable = false, nullable = false)
    @CreatedDate
    private LocalDateTime createdTime;

    @Column(nullable = false)
    @LastModifiedDate
    private LocalDateTime updatedTime;
*/
    public Product() {
    }

   
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public String get_Id() {
        return _id;
    }
    public void set_Id(String _id) {
        this._id = _id;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    public String getSmall_image() {
        return small_image;
    }
    public void setSmall_image(String small_image) {
        this.small_image = small_image;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getRetail_price() {
        return retail_price;
    }
    public void setRetail_price(String retail_price) {
        this.retail_price = retail_price;
    }

    public String getSale_price() {
        return sale_price;
    }
    public void setSale_price(String sale_price) {
        this.sale_price = sale_price;;
    }


    public String getSkuid() {
        return skuid;
    }
    public void setSkuid(String skuid) {
        this.skuid = skuid;
    }

  



    /*
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }
    */

    @Override
    public String toString() {
        return "Product{" +
                "small_image='" + small_image + '\'' +
                ", id='" + id + '\'' +
                ", _id='" + _id + '\'' +
                '}';
    }
}
