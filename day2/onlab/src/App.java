
// import java.time.LocalDate;
// import java.time.LocalTime;
// import java.time.Month;
// import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    static final int MAX = 500;

    public static void main(String[] args) throws Exception {

        // // charat
        // System.out.println("////////////////////////////////");
        // String name = "Đào Ngọc Tùng";
        // char ch = name.charAt(2);
        // System.out.println(ch);

        // // Index of
        // System.out.println("////////////////////////////////");

        // int index = name.indexOf("c");
        // System.out.println("Vị trí của chữ c là :" + index);

        // int index2 = name.indexOf("g", 7);
        // System.out.println("Vị trí chữ g thứ hai là: " + index2);

        // // Sub string
        // System.out.println("////////////////////////////////");
        // String lastName = name.substring(9);
        // System.out.println(lastName);

        // //Replace
        // System.out.println("////////////////////////////////");
        // String connectedName = name.replace(" ", "-");
        // System.out.println(connectedName);

        // //Truyền vào
        // Person person = new Person();
        // person.introduceMyself("Tùng", 25, "Hà Nội");

        // enum Season {
        // SPRING, SUMMER, FALL, WINTER;
        // }

        // //enum
        // System.out.println("////////////////");
        // Season season = Season.SPRING;
        // System.out.println(season);

        // Weekday tuesday = Weekday.TUESDAY;
        // System.out.println(tuesday);
        // System.out.println(tuesday.getValue());

        // Date & time

        // DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // //Lưu ý: dd: ngày - MM: tháng - yyyy năm, HH: giờ, mm phút

        // LocalDate today = LocalDate.now();
        // System.out.println("Today is : " + today.format(myFormat));

        // LocalDate currentDate = LocalDate.of(2020, Month.JUNE, 19);
        // System.out.println(currentDate);

        // System.out.println("Ngày hôm nay :" + today.getDayOfWeek());

        // System.out.println("Ngày tính theo năm: " + today.getDayOfYear());

        // System.out.println("thêm 7 ngày : " + today.plusDays(7));
        // System.out.println("thêm 1 tuần : " + today.plusWeeks(1));

        // System.out.println("thêm 7 ngày : " + today.minusDays(7));
        // System.out.println("thêm 1 tuần : " + today.minusWeeks(2));

        // LocalDate tomorrow = today.plusDays(1);
        // System.out.println("Ngày mai là : " + tomorrow);
        // System.out.println("Đó là thứ : " + tomorrow.getDayOfWeek());

        // LocalTime currentTime = LocalTime.now();
        // System.out.println("Bây giờ là : ");

        // // Hằng số
        // System.out.println("Giá trị lớn nhất là : " + MAX);

        // // Ép kiểu

        // int a = 5;
        // double b = a;
        // System.out.println(b);

        // double b1 = 10.5;
        // int a1 = (int) b1;
        // System.out.println(a1);

        // String s = "5";
        // int number = Integer.valueOf(s);
        // System.out.println(number);

        // Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi : ");
        Integer tuoi = Integer.parseInt(sc.nextLine());
        String s = (tuoi >= 18) ? "Du tuoi bau cu" : "Khong du tuoi bau cu";
        System.out.println(s);
        sc.close();
        // System.out.println("Nhập tên: ");
        // String name = sc.nextLine();

        // System.out.println("Nhập tuổi");
        // // int age = sc.nextInt();
        // int age = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập điểm trung bình: ");
        double point = Double.parseDouble(sc.nextLine());
        // System.out.println("Địa chỉ: ");
        // String address = sc.nextLine();

        // sc.close();
        // System.out.println("Tên của bạn là : " + name);
        // System.out.println("Tuổi của bạn là : " + age);
        System.out.println("Điểm của bạn là : " + point);
        // System.out.println("Địa chỉ của bạn là : " + address);

        // System.out.println();
        // System.out.println("Tôi tên là ");

    }
}
