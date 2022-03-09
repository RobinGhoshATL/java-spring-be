package com.rsg.dto;

public class ProductData {

   
    
    private Long id;
    private String _id;
    private String name;
    private String small_image;
    private String description;
    private String retail_price;
    private String sale_price;
    private String skuid;


    public ProductData() {
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


}
