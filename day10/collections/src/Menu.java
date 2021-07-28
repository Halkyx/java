import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    ReadFile readFile = new ReadFile();
    ArrayList<Product> productList = new ArrayList<Product>();
    HashMap<String, Integer> mapID = new HashMap<String, Integer>();

    public Menu() {
        productList = readFile.getData();
        for (Product product : productList) {
            mapID.put(product.getId(), productList.indexOf(product));
        }
    }

    void printProductList() {
        System.out.println("Danh sach san pham moi");
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    String takeInputID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap ma san pham tim kiem");
        sc.close();
        return sc.nextLine();
    }

    String takeInputType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Co cac loai san pham sau: Thuc an \\ Do gia dung \\ Quan ao \\ My pham");
        System.out.println("Vui long nhap loai san pham tim kiem");
        sc.close();
        return sc.nextLine();
    }

    void printMenu() {
        System.out.println("0 - Thoat khoi chuong trinh");
        System.out.println("1 - Xem san pham");
        System.out.println("2 - Them moi san pham");
        System.out.println("3 - Tim san pham theo ma san pham va sua san pham do");
        System.out.println("4 - Tim san pham theo ma san pham va xoa san pham do");
        System.out.println("5 - Xem san pham va so luong ban duoc");
        System.out.println("6 - Liet ke loai san pham va so luong san pham thuoc loai do");
    }

    // In danh sach san pham
    void optionOne() {
        System.out.println("Danh sach san pham dang co:");
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    // Them moi san pham
    void optionTwo() {
        Product productAdd = new Product();
        productAdd.inputNew();
        productList.add(productAdd);
        this.printProductList();
    }

    // Tim san pham va sua
    void optionThree() {
        Product product = new Product();
        String inputID = takeInputID();
        if (!mapID.containsKey(inputID)) {
            System.out.println("Khong tim thay san pham!");
        } else {
            product.editProduct();
            productList.set(mapID.get(inputID), product);
            this.printProductList();
        }
    }

    // Tim san pham va xoa
    void optionFour() {
        String inputID = takeInputID();
        if (!mapID.containsKey(inputID)) {
            System.out.println("Khong tim thay san pham!");
        } else {
            int index = mapID.get(inputID);
            productList.remove(index);
            this.printProductList();
        }
    }

    // Xem san pham va so luong ban duoc
    void optionFive() {
        String inputID = takeInputID();
        if (!mapID.containsKey(inputID)) {
            System.out.println("Khong tim thay san pham!");
        } else {
            int index = mapID.get(inputID);
            Product product = productList.get(index);
            System.out.println(product.toString());
        }
    }

    // Liet ke loai san pham va so luong san pham thuoc loai do
    void optionSix() {
        ProductType eNum = ProductType.NULL;
        String inputType = takeInputType();
        if (eNum.getENum(inputType) == null) {
            System.out.println("Khong tim thay san pham");
        } else {
            eNum = eNum.getENum(inputType);
            int count = 0;
            for (Product product : productList) {
                if (product.getProductType() == eNum) {
                    System.out.println(product.toString());
                    count++;
                }
            }
            System.out.println("So san pham thuoc loai " + eNum.getType() + " la: " + count);
        }
    }

}