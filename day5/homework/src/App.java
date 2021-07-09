import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "- " + name + " - " + age + " tuổi, đến từ " + address;
    }
}

public class App {
    public static void main(String[] args) {
        // Create list
        ArrayList<Student> listStudent = new ArrayList<Student>();
        // Create students
        Student student1 = new Student("Trần Thu Hoa", 20, "Hà Nội");
        Student student2 = new Student("Trịnh Công Mạnh", 19, "Nam Định");
        Student student3 = new Student("Mai Thành", 19, "Quảng Bình");
        Student student4 = new Student("Trịnh Anh Cương", 29, "Hà Nam");
        Student student5 = new Student("Đinh Thế Vũ", 19, "Hà Giang");
        Student student6 = new Student("Nguyển Hà Khiêm", 19, "Quảng Bình");
        Student student7 = new Student("Đào Ngọc Tùng", 19, "Quảng Bình");
        Student student8 = new Student("Vũ Chính", 19, "Quảng Bình");
        Student student9 = new Student("Mai Văn Phán", 19, "Quảng Bình");
        Student student10 = new Student("Lê Anh Vũ", 19, "Quảng Bình");
        Student student11 = new Student("Nguyễn Tuấn Sơn", 19, "Quảng Bình");

        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);
        listStudent.add(student6);
        listStudent.add(student7);
        listStudent.add(student8);
        listStudent.add(student9);
        listStudent.add(student10);
        listStudent.add(student11);

        // Show list
        System.out.println("Danh sách lớp học bao gồm " + listStudent.size() + " thành viên");
        for (Student student : listStudent) {

            System.out.println(student.toString());
        }
    }
}