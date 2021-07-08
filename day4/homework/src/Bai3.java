import java.util.Scanner;

public class Bai3 {
    public static void inputArray(int[][] arrayInt, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhap gia tri phan tu arrINT[%d][%d]:\t", i, j);
                arrayInt[i][j] = Integer.valueOf(scanner.nextLine());
            }
        }
    }

    public static void printArray(int[][] arrayInt, int n) {
        System.out.println("Mang duoc nhap la");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayInt[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void printArrayMainDiagonal(int[][] arrayInt, int n) {
        int diagonalLine[][] = new int[n][n];
        System.out.println("Duong cheo chinh la");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    diagonalLine[i][j] = arrayInt[i][j];
                } else {
                    diagonalLine[i][j] = 0;
                }
                System.out.print(diagonalLine[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang vuong:\t");
        int size = scanner.nextInt();
        int arrInt[][] = new int[size][size];
        inputArray(arrInt, size);
        printArray(arrInt, size);
        printArrayMainDiagonal(arrInt, size);
        scanner.close();
    }
}