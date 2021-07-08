import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) throws Exception {
        // Multiple object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kich thuoc mang:\t");
        int size = scanner.nextInt();

        Animal[] arrayAnimal = new Animal[size];

        for (int i = 0; i < arrayAnimal.length; i++) {
            System.out.printf("Dong vat thu %d\n", i+1);
            Animal animal = new Animal();
            animal.input();
            arrayAnimal[i] = animal;
        }

        System.out.println("Danh sach dong vat");
        for (Animal p : arrayAnimal) {
            System.out.println(p);
        }
    }
}