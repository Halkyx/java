import java.util.Scanner;

public class Rectangle {
    public void drawRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public int getWidth() throws ArithmeticException, NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        int width = 0;
        System.out.print("Nhap do dai chieu ngang cua hinh chu nhat:\t");
        width = Integer.valueOf(scanner.nextLine());
        scanner.close();
        if (width < 0)
            throw new ArithmeticException();
        return width;
    }

    public int getHeight() throws ArithmeticException, NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        int height = 0;
        System.out.print("Nhap do dai chieu doc cua hinh chu nhat:\t");
        height = Integer.valueOf(scanner.nextLine());
        scanner.close();
        if (height < 0)
            throw new ArithmeticException();
        return height;
    }

    public void execution() {
        int height = 0;
        int width = 0;
        boolean formatWidth = false;
        boolean formatHeight = false;

        while (!formatHeight) {
            try {
                while (!formatWidth) {
                    width = this.getWidth();
                    formatWidth = true;
                }
                height = this.getHeight();
                formatHeight = true;
            } catch (ArithmeticException ex1) {
                System.out.println("So nhap vao phai lon hon 0. Vui long nhap lai");
            } catch (NumberFormatException ex2) {
                System.out.println("Du lieu nhap vao khong hop le. Vui long nhap lai");
            }
        }
        this.drawRectangle(width, height);
    }

}