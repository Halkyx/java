import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ReadFile readFile = new ReadFile();
    ArrayList<Product> listProduct = new ArrayList<Product>();

    public Menu() {
        listProduct = readFile.getData();
    }

    void printList(ArrayList<Product> list) {
        list.forEach(p -> System.out.println(p));
    }

    TypeProduct selectingType(int choice) {
        switch (choice) {
            case 1:
                return TypeProduct.FOOD;
            case 2:
                return TypeProduct.HOUSEWARE;
            case 3:
                return TypeProduct.COSMETICS;
            case 4:
                return TypeProduct.FASHION;
            default:
                return TypeProduct.NULL;
        }
    }
    
    public void printMenu() {
        System.out.println("1 - Xem thong tin san pham");
        System.out.println("2 - In danh sach san pham co gia lon hon gia chon");
        System.out.println("3 - In danh sach san pham co so luong ban lon hon da chon");
        System.out.println("4 - Liet ke loai san pham theo loai san pham da chon");
        System.out.println("5 - Sap xep san pham theo so luong ban duoc");
        System.out.println("6 - Dua ra san pham ban duoc nhieu nhat");
        System.out.println("7 - Sap xep san pham theo ten");
        System.out.println("0 - Thoat khoi chuong trinh");
        System.out.print("Lua chon cua ban la: \t");
    }

    public void optionOne() {
        printList(listProduct);
    }

    public void optionTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon xem san pham co gia lon hon bao nhieu:\t");
        long selectedPrice = Long.valueOf(sc.nextLine());
        int count = (int) listProduct.stream().filter(product -> product.getPrice() > selectedPrice).count();
        System.out.printf("So san pham co gia lon hon %d la : %d\n", selectedPrice, count);
        listProduct.stream().filter(product -> product.getPrice() > selectedPrice).forEach(p -> System.out.println(p));
    }

    public void optionThree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon xem san pham co so luong ban lon hon bao nhieu:\t");
        int selectedAmountSale = Integer.valueOf(sc.nextLine());
        int count = (int) listProduct.stream().filter(product -> product.getAmountSale() > selectedAmountSale).count();
        System.out.printf("So san pham co muc ban nhieu hon %d san pham la: %d\n", selectedAmountSale, count);
        listProduct.stream().filter(product -> product.getAmountSale() > selectedAmountSale)
                .forEach(product -> System.out.println(product));
    }
    
    public void optionFour() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Danh sach cac mat hang san pham: (1) Thuc pham \\ (2) Do gia dung \\ (3) My pham \\ (4) Thoi trang");
        System.out.print("Vui long chon mat hang theo so:\t");
        int choice = Integer.valueOf(sc.nextLine());
        while (selectingType(choice) == TypeProduct.NULL) {
            System.out.println("Khong tim thay loai san pham!");
            System.out.print("Vui long chon mat hang theo so:\t ");
            choice = Integer.valueOf(sc.nextLine());
        }
        TypeProduct selectedTypeProduct = selectingType(choice);
        int count = (int) listProduct.stream().filter(product -> product.getType() == selectedTypeProduct).count();
        System.out.printf("So san pham thuoc mat hang \"%s\" la %d\n", selectedTypeProduct.getType(), count);
        listProduct.stream().filter(product -> product.getType() == selectedTypeProduct)
                .forEach(p -> System.out.println(p));
    }

    public void optionFive() {
        System.out.println("Danh sach san pham theo thu tu ban duoc tang dan:");
        listProduct.stream().sorted((o1, o2) -> o1.getAmountSale() < o2.getAmountSale() ? -1 : 1)
                .forEach(p -> System.out.println(p));
    }
    
    public void optionSix() {
        System.out.println("San pham ban duoc nhieu nhat la");
        listProduct.stream().sorted((o1, o2) -> o1.getAmountSale() > o2.getAmountSale() ? -1 : 1).limit(1)
                .forEach(p -> System.out.println(p));
    }
    
    public void optionSeven(){
        System.out.println("Sap xep san pham theo ten:");
        listProduct.stream().sorted((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()))
                .forEach(p -> System.out.println(p));
    }

}