package de.hhu.thymeleafsqlseq.domain;


public class Product {

    private Long id;
    private String brand;
    private float price;
    private boolean isDeleted;
    private String name;
    private ProductType productType;

    public Product() {
    }

    public Product(String brand, float price, String name, String productType) {
        this.brand = brand;
        this.price = price;
        this.isDeleted = false ;
        this.name = name;
        this.productType = new ProductType(productType);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }


    public float getPrice(){
        return this.price;
    }

    public void setPrice(float price){
        this.price=price;
    }

    public boolean getIsDeleted(){
        return this.isDeleted;
    }
    public void setIsDeleted(boolean isDeleted){
        this.isDeleted=isDeleted;
    }

    public String getProductType() {
        return productType.name();
    }

    public void setProductType(String productType) {
        this.productType = new ProductType(productType);
    }

    @Override
    public String toString() {
        return "Product{" +
               ", brand='" + brand + '\'' +
               ", price=" + price +
               ", isDeleted=" + isDeleted +
               ", name='" + name + '\'' +
               ", productType=" + productType +
               '}';
    }
}