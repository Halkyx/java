public class Product {
    private String codeProduct;
    private String name;
    private String description;
    private long price;
    private int quantity;
    private int sellQuantity;
    private String brand;
    private Type type;
    public String getCodeProduct() {
        return codeProduct;
    }
    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getSellQuantity() {
        return sellQuantity;
    }
    public void setSellQuantity(int sellQuantity) {
        this.sellQuantity = sellQuantity;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public Product(String codeProduct, String name, String description, long price, int quantity, int sellQuantity,
            String brand, Type type) {
        this.codeProduct = codeProduct;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.sellQuantity = sellQuantity;
        this.brand = brand;
        this.type = type;
    }
    @Override
    public String toString() {
        return "Product [brand=" + brand + ", codeProduct=" + codeProduct + ", name=" + name + ", description="
                + description + ", price=" + price + ", quantity=" + quantity + ", sellQuantity=" + sellQuantity + ", type="
                + type.getName() + "]";
    }
    
    
    
    
}