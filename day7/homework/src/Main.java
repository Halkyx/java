import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Price constant
    private final static long HAITRIEU = 2000000;
    private final static long BONTRIEU = 4000000;
    private final static long BAYTRIEU = 7000000;
    private final static long MUOIBATRIEU = 13000000;

    public static void printProduct(Product product) {
        System.out.println(product.toString());
    }

    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1 - Tra cuu san pham theo danh muc");
        System.out.println("2 - Tra cuu san pham theo hang");
        System.out.println("3 - Tra cuu san pham theo muc gia va danh muc");
        System.out.println("4 - Tra cuu san pham theo ten nhap vao");
        System.out.print("Vui long tra cuu san pham theo 4 lua chon tren:\t");
        int choice = Integer.valueOf(scanner.nextLine());
        while (choice > 4 || choice < 1) {
            System.out.println("Ban nhap lua chon khong phu hop");
            System.out.print("Vui long chon lai:\t");
            choice = Integer.valueOf(scanner.nextLine());
        }
        scanner.close();
        return choice;
    }

    // First choice

    public static int choiceDanhMuc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh sach cac mat hang: ");
        System.out.println(Type.PHONE.getOrder() + " - " + Type.PHONE.getName());
        System.out.println(Type.LAPTOP.getOrder() + " - " + Type.LAPTOP.getName());
        System.out.println(Type.ACCESSORIES.getOrder() + " - " + Type.ACCESSORIES.getName());
        System.out.println(Type.CLOCK.getOrder() + " - " + Type.CLOCK.getName());
        System.out.print("Vui long nhap mat hang ban muon tra cuu:\t");
        int choice = Integer.valueOf(scanner.nextLine());
        while (choice > Type.CLOCK.getOrder() || choice < Type.PHONE.getOrder()) {
            System.out.println("Ban nhap lua chon khong phu hop");
            System.out.print("Vui long chon lai:\t");
            choice = Integer.valueOf(scanner.nextLine());
        }
        scanner.close();
        return choice;
    }

    public static void returnDanhMuc(ArrayList<Product> listProductVar, int choice) {
        if (choice == Type.PHONE.getOrder()) {
            System.out.println("Mat hang ban mua tra cuu la: " + Type.PHONE.getName());
            for (Product product : listProductVar) {
                if (product.getType() == Type.PHONE) {
                    printProduct(product);
                }
            }
        }
        if (choice == Type.LAPTOP.getOrder()) {
            System.out.println("Mat hang ban mua tra cuu la: " + Type.LAPTOP.getName());
            for (Product product : listProductVar) {
                if (product.getType() == Type.LAPTOP) {
                    printProduct(product);
                }
            }
        }
        if (choice == Type.ACCESSORIES.getOrder()) {
            for (Product product : listProductVar) {
                System.out.println("Mat hang ban mua tra cuu la: " + Type.ACCESSORIES.getName());
                if (product.getType() == Type.ACCESSORIES) {
                    printProduct(product);
                }
            }
        }
        if (choice == Type.CLOCK.getOrder()) {
            System.out.println("Mat hang ban mua tra cuu la: " + Type.CLOCK.getName());
            for (Product product : listProductVar) {
                if (product.getType() == Type.CLOCK) {
                    printProduct(product);
                }
            }
        }
    }

    // Second choice

    public static String getBrand() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten hang ban muon tra cuu:\t");
        String brand = scanner.nextLine();
        scanner.close();
        return brand;
    }

    public static void returnBrand(ArrayList<Product> listProduct, String brand) {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        while (!found) {
            for (Product product : listProduct) {
                if (product.getBrand().equalsIgnoreCase(brand)) {
                    printProduct(product);
                    if (!found) {
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println("Khong tim thay nhan hang ban tra cuu");
                System.out.print("Vui long nhap lai nhan hang: \t");
                brand = scanner.nextLine();
            }
            scanner.close();
        }
    }

    // Third choice

    public static int choiceMucGia() {
        Scanner scanner = new Scanner(System.in);
        int mucGia = 0;
        System.out.println("Vui long chon muc gia");
        System.out.println("1 - It hon " + HAITRIEU);
        System.out.println("2 - Tu " + HAITRIEU + " den " + BONTRIEU);
        System.out.println("3 - Tu " + BONTRIEU + " den " + BAYTRIEU);
        System.out.println("4 - Tu " + BAYTRIEU + " den " + MUOIBATRIEU);
        System.out.println("5 - Tren " + MUOIBATRIEU);
        do {
            System.out.print("Vui long cho biet lua chon cua ban:\t");
            mucGia = Integer.valueOf(scanner.nextLine());
        } while (mucGia < 0 || mucGia > 6);
        scanner.close();
        return mucGia;
    }

    public static void checkGia(ArrayList<Product> listProduct, int choiceMucGia) {
        boolean isFound = false;
        switch (choiceMucGia) {
            case 1:
                for (Product product : listProduct) {
                    if (product.getPrice() < HAITRIEU) {
                        if (!isFound)
                            isFound = true;
                        printProduct(product);
                    }
                }
                break;
            case 2:
                for (Product product : listProduct) {
                    if (product.getPrice() >= HAITRIEU && product.getPrice() < BONTRIEU) {
                        if (!isFound)
                            isFound = true;
                        printProduct(product);
                    }
                }
                break;
            case 3:
                for (Product product : listProduct) {
                    if (product.getPrice() >= BONTRIEU && product.getPrice() < BAYTRIEU) {
                        if (!isFound)
                            isFound = true;
                        printProduct(product);
                    }
                }
                break;
            case 4:
                for (Product product : listProduct) {
                    if (product.getPrice() >= BAYTRIEU && product.getPrice() < MUOIBATRIEU) {
                        if (!isFound)
                            isFound = true;
                        printProduct(product);
                    }
                }
                break;
            case 5:
                for (Product product : listProduct) {
                    if (product.getPrice() >= MUOIBATRIEU) {
                        if (!isFound)
                            isFound = true;
                        printProduct(product);
                    }
                }
                break;
        }
        if (!isFound) {
            System.out.println("Khong co mat hang nao phu hop");
        }
    }

    public static void returnMucGia(ArrayList<Product> listProduct, int choiceDanhMuc, int choiceMucGia) {
        if (choiceDanhMuc == Type.PHONE.getOrder()) {
            ArrayList<Product> listProductType = new ArrayList<Product>();
            for (Product product : listProduct) {
                if (product.getType() == Type.PHONE) {
                    listProductType.add(product);
                }
            }
            checkGia(listProductType, choiceMucGia);
        }
        if (choiceDanhMuc == Type.LAPTOP.getOrder()) {
            ArrayList<Product> listProductType = new ArrayList<Product>();
            for (Product product : listProduct) {
                if (product.getType() == Type.LAPTOP) {
                    listProductType.add(product);
                }
            }
            checkGia(listProductType, choiceMucGia);
        }
        if (choiceDanhMuc == Type.ACCESSORIES.getOrder()) {
            ArrayList<Product> listProductType = new ArrayList<Product>();
            for (Product product : listProduct) {
                if (product.getType() == Type.ACCESSORIES) {
                    listProductType.add(product);
                }
            }
            checkGia(listProductType, choiceMucGia);
        }
        if (choiceDanhMuc == Type.CLOCK.getOrder()) {
            ArrayList<Product> listProductType = new ArrayList<Product>();
            for (Product product : listProduct) {
                if (product.getType() == Type.CLOCK) {
                    listProductType.add(product);
                }
            }
            checkGia(listProductType, choiceMucGia);
        }

    }

    // Fourth choice

    public static String getText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tu khoa tim kiem:\t");
        String getText = scanner.nextLine();
        scanner.close();
        return getText;
    }

    public static void returnText(ArrayList<Product> listProduct, String inputText) {
        String inputTextLowerCase = inputText.toLowerCase();
        Boolean found = false;
        for (Product product : listProduct) {
            String productName = product.getName().toLowerCase();
            if (productName.contains(inputTextLowerCase)) {
                if (!found)
                    found = true;
                printProduct(product);
            }
        }
        if (!found)
            System.out.println("Khong co tu khoa phu hop.");
    }
    
    public static void main(String[] args) throws Exception {
        // Khoi tao du lieu
        ArrayList<Product> listProduct = new ArrayList<Product>();
        AddProduct addProduct = new AddProduct();
        addProduct.phone(listProduct);
        addProduct.accessory(listProduct);
        addProduct.laptop(listProduct);
        addProduct.clock(listProduct);

        // Check data
        // for (Product product : listProduct) {
        // System.out.println(product.getBrand());
        // }

        int numChoice = menu();
        switch (numChoice) {
            case 1:
                int choiceDanhMuc1 = choiceDanhMuc();
                returnDanhMuc(listProduct, choiceDanhMuc1);
                break;
            case 2:
                String choiceBrand = getBrand();
                returnBrand(listProduct, choiceBrand);
                break;
            case 3:
                int choiceDanhMuc2 = choiceDanhMuc();
                int choiceMucGia = choiceMucGia();
                returnMucGia(listProduct, choiceDanhMuc2, choiceMucGia);
                break;
            case 4:
                String getText = getText();
                returnText(listProduct, getText);
                break;
        }
    }
}