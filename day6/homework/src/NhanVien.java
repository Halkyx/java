import java.util.Scanner;

public abstract class NhanVien {
    private String id;
    private String name;
    private int age;
    private String soDienThoai;
    private String email;
    private long basicSalary;
    private String kieuNhanVien;

    public String getKieuNhanVien() {
        return kieuNhanVien;
    }

    public void setKieuNhanVien(String kieuNhanVien) {
        this.kieuNhanVien = kieuNhanVien;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ID cua nhan vien:\t");
        id = scanner.nextLine();
        System.out.print("Nhap ten cua nhan vien:\t");
        name = scanner.nextLine();
        System.out.print("Nhap tuoi cua nhan vien:\t");
        age = Integer.valueOf(scanner.nextLine());
        System.out.print("Nhap so dien thoai cua nhan vien:\t");
        soDienThoai = scanner.nextLine();
        System.out.print("Nhap email cua nhan vien:\t");
        email = scanner.nextLine();
        System.out.print("Nhap luong co ban cua nhan vien:\t");
        basicSalary = Long.valueOf(scanner.nextLine());
        scanner.close();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public abstract long totalSalary();

    @Override
    public String toString() {
        return "NhanVien [id=" + id + ", name=" + name + ", age=" + age + ", soDienThoai=" + soDienThoai + ", email="
                + email + ", kieuNhanVien=" + kieuNhanVien + ", basicSalary=" + basicSalary + ", totalSalary=" + totalSalary() + "]";
    }

    

}