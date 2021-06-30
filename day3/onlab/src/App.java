import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // // So sanh hai so
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Nhap so thu nhat: ");
        // int soThuNhat = scan.nextInt();
        // System.out.println("Nhap so thu nhat: ");
        // int soThuHai = scan.nextInt();
        // scan.close();
        // if (soThuNhat > soThuHai) {
        // System.out.printf("So %d lon hon so %d\n", soThuNhat, soThuHai);
        // } else if (soThuNhat == soThuHai) {
        // System.out.printf("So %d bang so %d\n", soThuNhat, soThuHai);
        // } else {
        // System.out.printf("So %d nho hon so %d\n", soThuNhat, soThuHai);
        // }

        // //kiem tra chan le

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Nhap so kiem tra: ");
        // int i = scan.nextInt();
        // scan.close();
        // if (i % 2 == 0) {
        // System.out.printf("So %d la so chan \n", i);
        // } else {
        // System.out.printf("So %d la so le \n", i);
        // }
        // }

        // // Kiem tra hai chuoi
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Nhap chuoi thu nhat: ");
        // String name1 = scan.nextLine();
        // System.out.println("Nhap chuoi thu hai: ");
        // String name2 = scan.nextLine();
        // scan.close();
        // if (name1.equalsIgnoreCase(name2)) {
        // System.out.printf("Hai chuoi %s va %s giong nhau\n", name1, name2);
        // } else {
        // System.out.printf("Hai chuoi %s va %s khac nhau\n", name1, name2);
        // }

        // // Long if else
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Nhap so thu nhat: ");
        // int soThuNhat = scan.nextInt();
        // System.out.println("Nhap so thu nhat: ");
        // int soThuHai = scan.nextInt();
        // scan.close();
        // if (soThuNhat <= soThuHai) {
        // if (soThuNhat == soThuHai) {
        // System.out.printf("So %d bang so %d\n", soThuNhat, soThuHai);
        // } else {
        // System.out.printf("So %d nho hon so %d\n", soThuNhat, soThuHai);
        // }
        // } else {
        // System.out.printf("So %d lon hon so %d\n", soThuNhat, soThuHai);
        // }

        // // BMI
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Can nang theo kg: ");
        // float canNang = scan.nextFloat();

        // System.out.println("Chieu cao theo m: ");
        // float chieuCao = scan.nextFloat();
        // scan.close();

        // float BMI = (float) (canNang / (Math.pow(chieuCao, 2)));
        // if (BMI < 18.5) {
        // System.out.printf("Voi chi so BMI la %.1f, ban dang thieu can\n", BMI);
        // }
        // if (BMI >= 18.5 && BMI <= 24.9) {
        // System.out.printf("Voi chi so BMI la %.1f, ban dang can doi\n", BMI);
        // }
        // if (BMI >= 24.9) {
        // System.out.printf("Voi chi so BMI la %.1f, ban dang thua can\n", BMI);
        // }

        // // Switch case
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Xin moi nhap so tu 1 den 3: ");
        // int number1 = scan.nextInt();
        // scan.close();

        // switch (number1) {
        // case 1: {
        // System.out.println("Ban vua nhap so 1");
        // break;
        // }
        // case 2: {
        // System.out.println("Ban vua nhap so 2");
        // break;
        // }
        // case 3: {
        // System.out.println("Ban vua nhap so 3");
        // break;
        // }
        // }

        // // Ngay thang nam
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Nhap thang ban muon tra ngay: ");
        // int thang = sc.nextInt();
        // sc.close();
        // switch (thang) {
        // case 1, 3, 5, 7, 8, 10, 12: {
        // System.out.printf("Thang %d co 31 ngay\n", thang);
        // break;
        // }
        // case 4, 6, 9, 11: {
        // System.out.printf("Thang %d co 30 ngay\n", thang);
        // break;
        // }
        // case 2: {
        // System.out.printf("Thang %d co 28 hoac 29 ngay \n", thang);
        // break;
        // }
        // default: {
        // System.out.println("So ban nhap khong phai la 12 thang trong nam");
        // break;
        // }
        // }

        // for (int i = 0; i <= 10; i+= 2){
        // System.out.printf("So thu tu la : %d\n", i);
        // }

        // for (int i = 0; i <= 10; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // }

        // String print = new String();
        // String fizz = "Fizz";
        // String buzz = "Buzz";
        // // String auto = "Auto";
        // for (int i = 1; i <= 100; i++) {
        // print = "";
        // if (i % 3 != 0 && i % 5 != 0 /* && i % 2 != 0 */) {
        // System.out.println(i);
        // continue;
        // }
        // if (i % 3 == 0) {
        // print += fizz;
        // }
        // if (i % 5 == 0) {
        // print += buzz;
        // }
        // // if (i % 2 == 0) {
        // // print += auto;
        // // }
        // System.out.println(print);
        // }

        // // Check so nguyen duong
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Nhap so nguyen duong bat ky: ");
        // int num = sc.nextInt();
        // if (num < 0) {
        // while (num < 0) {
        // System.out.println("Vui nhap lai so nguyen duong: ");
        // num = sc.nextInt();
        // }
        // System.out.printf("So cua ban la %d\n", num);

        // } else {
        // System.out.printf("So cua ban la %d\n", num);
        // }
        // sc.close();

        // // Dao nguoc chuoi
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Nhap chuoi ban dau: ");
        // String str = sc.nextLine();
        // sc.close();

        // System.out.printf("Chuoi ban dau la %s\n", str);
        // for (int i = str.length() - 1; i >= 0; i--) {
        // System.out.print(str.charAt(i));
        // }
        // System.out.println();

        // Dem so chu xuat hien va thu tu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi ban dau: ");
        String str = sc.nextLine();
        System.out.println("Nhap chu can dem : ");
        char c = sc.nextLine().charAt(0);
        sc.close();

        int j = 0;
        int stt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                stt = i + 1;
                System.out.printf("Chu %c xuat hien o vi tri %d\n", c, stt);
                j++;
            }
        }
        System.out.printf("So lan xuat hien ky tu %c trong chuoi %s la %d\n", c, str, j);
    }
}
