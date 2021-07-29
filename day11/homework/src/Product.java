import java.text.DecimalFormat;

public class Product {
    private String id;
    private String name;
    private TypeProduct type;
    private int amount;
    private int amountSale;
    private int shortPrice;
    private long price;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public TypeProduct getType() {
        return type;
    }
    public void setType(TypeProduct type) {
        this.type = type;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmountSale() {
        return amountSale;
    }
    public void setAmountSale(int amountSale) {
        this.amountSale = amountSale;
    }
    public int getShortPrice() {
        return shortPrice;
    }
    public void setShortPrice(int shortPrice) {
        this.shortPrice = shortPrice;
    }

    public long getPrice() {
        if (price == 0) {
            price = shortPrice * 1000;}
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }

    public Product() {
        this.price = (long) this.shortPrice * 1000;
    }
    
    public static String formatMoney(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0");
        return formatter.format(money);
    }



    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", type=" + type.getType() + ", price=" + formatMoney(getPrice())
                + ", amount=" + amount + ", amountSale=" + amountSale + "]";
    }
    
    
}