import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        menu.printMenu();

        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
       
        switch (choose) {
            case 0:
                System.exit(0);
                break;
            case 1:
                menu.optionOne();
                break;
            case 2:
                menu.optionTwo();
                break;
            case 3:
                menu.optionThree();
                break;
            case 4:
                menu.optionFour();
                break;
            case 5:
                menu.optionFive();
                break;
            case 6:
                menu.optionSix();
            default:
                System.exit(0);
        }
        sc.close();
    }
}