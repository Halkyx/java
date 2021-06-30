import java.util.Scanner;

public class BMI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cân nặng theo kg: ");
        float canNang = sc.nextFloat();

        System.out.println("Chiều cao theo m: ");
        float chieuCao = sc.nextFloat();
        sc.close();

        float BMI = (float) (canNang / (Math.pow(chieuCao, 2)));
        System.out.printf("Chỉ số BMI của bạn là : %.1f\n", BMI);

        if (BMI < 18.5) {
            System.out.println("Cơ thể bạn gầy");
        }
        if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Cơ thể bạn bình thường");
        }
        if (BMI >= 25 && BMI <= 30) {
            System.out.println("Cơ thể bạn thừa cân");
        }
        if (BMI >30) {
            System.out.println("Cơ thể bạn béo phì");
        }
    }
}
