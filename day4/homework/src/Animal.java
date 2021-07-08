import java.util.Scanner;

public class Animal {
    String name;
    String color;
    int legNumber;

    // Constructor
    public Animal(String name, String color, int legNumber) {
        this.name = name;
        this.color = color;
        this.legNumber = legNumber;
    }

    // Default constructor
    public Animal() {
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten dong vat:\t");
        name = sc.nextLine();
        System.out.print("Nhap mau long dong vat:\t");
        color = sc.nextLine();
        System.out.print("Nhap so chan dong vat:\t");
        legNumber = Integer.valueOf(sc.nextLine());
    }

    @Override
    public String toString() {
        return name + " - " + color + " - " + legNumber;
    }
}
