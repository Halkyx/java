import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chiều dài cạnh kề: ");
        int canhKe = sc.nextInt();

        System.out.println("Chiều dài cạnh đối: ");
        int canhDoi = sc.nextInt();
        sc.close();
        // System.out.println(canhKe);
        // System.out.println(canhDoi);


        double canhHuyen = Math.sqrt(Math.pow(canhKe, 2) + Math.pow(canhDoi, 2));
        // System.out.println(canhHuyen);
        System.out.printf("Chiều dài cạnh huyền là : %.2f\n",canhHuyen);

    }
}