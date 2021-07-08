import java.util.Scanner;

public class Bai1 {

    public static void inputArrayString(String[] arrayString) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arrayString.length; i++) {
            System.out.print("Nhap chuoi cua index " + i + " :   ");
            arrayString[i] = scan.nextLine();
        }
    }

    public static void printArrayString(String[] arrayString) {
        for (int i = 0; i < arrayString.length; i++) {
            System.out.printf("Index [%d] co noi dung: %s\n", i, arrayString[i]);
        }
    }

    public static int countJava(String[] arrayString) {
        int count = 0;
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].equals("Java")) {
                count++;
            }
        }
        return count;
    }

    public static void stringPosition(String str, String[] arrayString) {
        boolean available = false;
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].equals(str)) {
                if (available == false) {
                    available = true;
                }
                System.out.printf("Tu khoa \"%s\" da xuat hien o index %d.\n", str, i);
            }
        }
        if (available == false) {
            System.out.printf("Tu khoa \"%s\" khong xuat hien trong mang\n", str);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai mang:\t");
        int lengthArray = Integer.valueOf(sc.nextLine());
        String[] arrString = new String[lengthArray];
        inputArrayString(arrString);
        System.out.println("Nhap chuoi muon kiem tra: ");
        String checkString = sc.nextLine();
        // In ra array
        System.out.println("Mang string co noi dung nhu sau :");
        printArrayString(arrString);

        // Counting java
        System.out.printf("So lan xuat hien cua chuoi \"Java\" la : %d\n", countJava(arrString));

        // Kiem tra vi tri xuat hien
        stringPosition(checkString, arrString);
        sc.close();

    }
}