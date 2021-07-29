import java.util.Scanner;

public class BMI {
    public float getWeight() {
        Float returnValue = (float) 0;
        boolean format = false;
        Scanner scanner = new Scanner(System.in);
        while (!format) {
            try {
                System.out.print("Nhap can nang theo kg: \t");
                returnValue = Float.valueOf(scanner.nextLine());
                if (returnValue < 0) {
                    throw new ArithmeticException();
                }
                format = true;
            } catch (NumberFormatException ex1) {
                System.out.println("Thong tin nhap vao khong hop le. Vui long nhap lai");
            } catch (ArithmeticException ex2) {
                System.out.println("Con so nhap vao phai lon hon 0. Vui long nhap lai");
            }
        }
        return returnValue;
    }

    public float getHeight() {
        Float returnValue = (float) 0;
        boolean format = false;
        Scanner scanner = new Scanner(System.in);
        while (!format) {
            try {
                System.out.print("Nhap chieu cao theo m: \t");
                returnValue = Float.valueOf(scanner.nextLine());
                if (returnValue < 0) {
                    throw new ArithmeticException();
                }
                format = true;
            } catch (NumberFormatException ex1) {
                System.out.println("Thong tin nhap vao khong hop le. Vui long nhap lai");
            } catch (ArithmeticException ex2) {
                System.out.println("Con so nhap vao phai lon hon 0. Vui long nhap lai");
            }

        }
        return returnValue;
    }

    public float BMIcalculate(float height, float weight) {
        float bmi = (float) (weight / (Math.pow(height, 2)));
        System.out.printf("Chi so BMI cua ban la: %.2f\n", bmi);
        return bmi;
    }

    public void BMIrank(float BMI) {
        if (BMI < 18.5) {
            System.out.println("Co the ban gay");
            return;
        }
        if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Co the ban binh thuong");
            return;
        }
        if (BMI >= 25 && BMI <= 30) {
            System.out.println("Co the ban thua can");
            return;
        }
        if (BMI > 30) {
            System.out.println("Co the ban beo phi");
            return;
        }
    }

    public void execution() {
        Float height = this.getHeight();
        Float weight = this.getWeight();
        this.BMIrank(this.BMIcalculate(height, weight));
    }
}