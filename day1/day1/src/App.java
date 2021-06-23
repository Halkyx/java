  
public class App {
    public static void main(String[] args) throws Exception {
        // Introduction
        Intro intro = new Intro();
        intro.getName();
        intro.getAge();
        intro.getAddress();

        // Calculator
        Calcu calcu = new Calcu();
        int num1 = calcu.add();
        int num2 = calcu.sub();
        int num3 = calcu.mul();
        double num4 = calcu.div();

        calcu.displayNumber();
        System.out.println("Addition result : " + num1);
        System.out.println("Subtraction result : " + num2);
        System.out.println("Multiplication result : " + num3);
        System.out.println("Division result : "+ num4);
    }
}