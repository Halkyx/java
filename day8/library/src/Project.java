import java.util.Random;
import java.util.Scanner;

public class Project extends Book implements iKho {
    private int pageNumber;
    private Status status;
    private int defendYear;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getDefendYear() {
        return defendYear;
    }

    public void setDefendYear(int defendYear) {
        this.defendYear = defendYear;
    }

    public Project() {
    }

    public Project(String id, String bookISBN, String bookTitle, String publisherName, int publishedYear,
            int pageNumber, Status status, int defendYear) {
        super(id, bookISBN, bookTitle, publisherName, publishedYear);
        this.pageNumber = pageNumber;
        this.status = status;
        this.defendYear = defendYear;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("Nhap so trang sach:\t");
        setPageNumber(Integer.valueOf(scanner.nextLine()));
        System.out.print("Nhap tinh trang (Moi ve/Tot/Kem):\t");
        Status catcherStatus = Status.valueOf("NEW");
        setStatus(catcherStatus.returnStatus(scanner.nextLine()));
        System.out.print("Nhap nam bao ve:\t");
        setDefendYear(Integer.valueOf(scanner.nextLine()));
        scanner.close();
    }

    @Override
    public String toString() {
        return super.toString() + " pageNumber=" + pageNumber + ", status=" + status + ", defendYear=" + defendYear;
    }

    @Override
    public void position() {
        Random random = new Random();
        System.out.printf("Vi tri cua sach giao khoa o ke so %d\n", random.nextInt(10) + 1);
    }

}