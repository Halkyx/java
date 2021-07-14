import java.util.ArrayList;

public class AddProduct {
    private final static String PHONE = "PHONE";
    private final static String LAPTOP = "LAPTOP";
    private final static String ACCESSORIES = "ACCESSORIES";
    private final static String CLOCK = "CLOCK";

    public void phone(ArrayList<Product> listProduct) {
        // iPhone
        listProduct.add(
                new Product("iP01", "iPhone12", "iphone12 128 GB", 23000000, 25, 12, "Apple", Type.valueOf(PHONE)));
        listProduct.add(new Product("iP02", "iPhone12 Pro", "iphone12 Pro 256 GB", 27800000, 50, 25, "Apple",
                Type.valueOf(PHONE)));
        listProduct.add(new Product("iP03", "iPhone12 Pro Max", "iphone12 Pro Max 256 GB", 36700000, 25, 16, "Apple",
                Type.valueOf(PHONE)));
        listProduct.add(
                new Product("iP04", "iPhone11", "iphone11 64 GB VN/A", 15900000, 30, 14, "Apple", Type.valueOf(PHONE)));
        // Samsung
        listProduct.add(new Product("pS01", "Samsung Galaxy S21", "Samsung Galaxy S21 Ultra 128 GB", 20900000, 30, 16,
                "Samsung", Type.valueOf(PHONE)));
        listProduct.add(new Product("pS02", "Samsung Galaxy Note 20", "Samsung Galaxy Note 20 Ultra", 18500000, 35, 21,
                "Samsung", Type.valueOf(PHONE)));
        listProduct.add(new Product("pS03", "Samsung Galaxy Z Fold 2", "Samsung Galaxy Z Fold Summer Edition", 45900000,
                20, 3, "Samsung", Type.valueOf(PHONE)));
    }

    public void laptop(ArrayList<Product> listProduct) {
        // iMac
        listProduct.add(new Product("iM01", "Macbook Air 2020", "Macbook Air 12\" 256GB", 24600000, 30, 11, "Apple",
                Type.valueOf(LAPTOP)));
        listProduct.add(new Product("iM02", "MacBook Air 2021", "Macbook Air 13\" 512GB", 41500000, 15, 7, "Apple",
                Type.valueOf(LAPTOP)));
        listProduct.add(new Product("iM03", "iMac 2021", "iMac 2021 24\" 8 Core CPU", 41500000, 28, 14, "Apple",
                Type.valueOf(LAPTOP)));
        listProduct.add(new Product("iM04", "iMac 2020", "iMac 2020 22\" 7 Core CPU", 31500000, 24, 9, "Apple",
                Type.valueOf(LAPTOP)));
        // Lenovo
        listProduct.add(new Product("lL01", "Lenovo Legion 5", "Laptop core i7 8 GB", 27000000, 8, 2, "Lenovo",
                Type.valueOf(LAPTOP)));
        listProduct.add(new Product("lL02", "Lenovo IdeaPad 3", "Laptop core i3 4 GB", 12700000, 13, 4, "Lenovo",
                Type.valueOf(LAPTOP)));
        listProduct.add(new Product("lL03", "Lenovo Yoga 9", "Laptop core i7 16 GB", 47000000, 8, 2, "Lenovo",
                Type.valueOf(LAPTOP)));
    }

    public void accessory(ArrayList<Product> listProduct) {
        // Anker
        listProduct.add(new Product("aA01", "Anker PowerCore Slim", "1 USB-C 1 USB-A", 1100000, 30, 11, "Anker",
                Type.valueOf(ACCESSORIES)));
        listProduct.add(new Product("aA02", "Anker PowerCore Speed", "1 USB-C 1 USB-A", 1550000, 19, 8, "Anker",
                Type.valueOf(ACCESSORIES)));
        listProduct.add(new Product("aA03", "Anker PowerCore Lite", "1 USB-C 1 USB-A", 1000000, 45, 26, "Anker",
                Type.valueOf(ACCESSORIES)));
        // SanDisk
        listProduct.add(
                new Product("aS01", "SanDisk USB 16GB", "16GB", 90000, 30, 11, "SanDisk", Type.valueOf(ACCESSORIES)));
        listProduct.add(new Product("aS02", "SanDisk Micro 128GB", "128GB", 350000, 50, 26, "SanDisk",
                Type.valueOf(ACCESSORIES)));
        listProduct.add(new Product("aS03", "SanDisk Micro 64GB", "64GB", 190000, 38, 14, "SanDisk",
                Type.valueOf(ACCESSORIES)));
    }

    public void clock(ArrayList<Product> listProduct) {
        // AppleWatch
        listProduct.add(
                new Product("cA01", "Apple Watch SE", "Day nhom vai", 9200000, 16, 4, "Apple", Type.valueOf(CLOCK)));
        listProduct.add(
                new Product("cA02", "Apple Series 6", "Day thep", 18600000, 22, 14, "Apple", Type.valueOf(CLOCK)));
        listProduct.add(
                new Product("cA03", "Apple Series 3", "Day nhua", 5200000, 8, 2, "Apple", Type.valueOf(CLOCK)));
        //Xiaomi
        listProduct.add(new Product("cX01", "Xiaomi Band 6", "Day nhua", 990000, 8, 2, "Xiaomi", Type.valueOf(CLOCK)));
        listProduct.add(new Product("cX02", "Xiaomi Band 5", "Day nhua", 680000, 11, 9, "Xiaomi", Type.valueOf(CLOCK)));
        listProduct.add(new Product("cX03", "Xiaomi Watch Lite", "Day nhua", 1350000, 9, 6, "Xiaomi", Type.valueOf(CLOCK)));
    }
}