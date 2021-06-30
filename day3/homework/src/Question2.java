import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap chuoi kiem tra palindrome");
        String palindrome = scanner.nextLine();
        scanner.close();
        int i= 0;
        int j = palindrome.length() - 1;
        boolean found = false;
        while (i < j) {
            if (palindrome.charAt(i) != palindrome.charAt(j)) {
                System.out.println("Chuoi nay khong phai la chuoi palindrome");
                found = true;
                break;
            }
            i++;
            j--;
        }
        if (found == false) {System.out.println("Chuoi nay la chuoi palindrome");}
    }
}
