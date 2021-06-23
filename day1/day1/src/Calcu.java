public class Calcu {
    int num1 = 3625;
    int num2 = 50;

    public void displayNumber() {
        System.out.println("Initial numbers are :" + num1 + " and " + num2);

    }

    // Cộng
    public int add() {
        int a = num1 + num2;
        return a;
    }

    // Trừ
    public int sub() {
        int a = num1 - num2;
        return a;
    }

    // Nhân
    public int mul() {
        int a = num1 * num2;
        return a;
    }

    // Chia
    public double div() {
        double a = (double) num1 / num2;
        return a;
    }

}