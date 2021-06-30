public class Question1 {
    public static void main(String[] args) throws Exception {
        String check = "Hello every one";
        int count = 0;
        System.out.printf("String ban dau la \"%s\"\n", check);
        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) == 'e') {
                count++;
                System.out.printf("Chu 'e' xuat hien o index %d\n", i);
            }
        }
        System.out.printf("Chu 'e' xuat hien tong cong la : %d\n", count);
    }
}
