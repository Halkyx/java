import java.text.DecimalFormat;
import java.util.Scanner;

public class Product {
    private String id;
    private String name;
    private ProductType productType;
    private int quantity;
    private int shortPrice;
    private long price;
    private int soldQuantity;

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getShortPrice() {
        return shortPrice;
    }

    public void setShortPrice(int shortPrice) {
        this.shortPrice = shortPrice;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public static String formatMoney(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0");
        return formatter.format(money);

    }

    public Product(String id, String name, ProductType productType, int quantity, int shortPrice, int soldQuantity) {
        this.id = id;
        this.name = name;
        this.productType = productType;
        this.quantity = quantity;
        this.shortPrice = shortPrice;
        this.soldQuantity = soldQuantity;
    }

    public void getData() {
        ProductType type = ProductType.NULL;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma san pham:\t");
        this.id = sc.nextLine();
        System.out.print("Nhap ten san pham:\t");
        this.name = sc.nextLine();
        System.out.println("Nhap loai san pham: Thuc an \\ Do gia dung\\ Quan ao\\ My pham");
        this.productType = type.getENum(sc.nextLine());
        System.out.print("Nhap so luong hang:\t");
        this.quantity = Integer.valueOf(sc.nextLine());
        System.out.print("Nhap gia ban:\t");
        this.price = Long.valueOf(sc.nextLine());
        System.out.print("Nhap so luong ban:\t");
        this.soldQuantity = Integer.valueOf(sc.nextLine());
        sc.close();
    }

    public void inputNew() {
        System.out.println("Them vao san pham moi:");
        this.getData();
    }

    public void editProduct() {
        System.out.println("Vui long sua doi thong tin san pham moi:");
        this.getData();
    }

    @Override
    public String toString() {
        if (this.shortPrice != 0) {
            this.price = this.shortPrice * 1000;
        }
        return "Product [Id=" + id + ", name=" + name + ", productType=" + productType.getType() + ", price="
                + formatMoney(price) + ", quantity=" + quantity + ", soldQuantity=" + soldQuantity + "]";
    }

}