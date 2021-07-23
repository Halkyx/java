import java.util.Random;
import java.util.Scanner;

public class TextBook extends Book implements iMuon, iKho{
    private int pageNumber;
    private Status status;
    private int totalTextBookCount;
    private int lentCount;
    private int remaining;

    public TextBook() {

    }

    public TextBook(String id, String bookISBN, String bookTitle, String publisherName, int publishedYear,
            int pageNumber, Status status, int totalTextBookCount, int lentCount) {
        super(id, bookISBN, bookTitle, publisherName, publishedYear);
        this.pageNumber = pageNumber;
        this.status = status;
        this.totalTextBookCount = totalTextBookCount;
        this.lentCount = lentCount;
    }

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

    public int getTotalTextBookCount() {
        return totalTextBookCount;
    }

    public void setTotalTextBookCount(int totalTextBookCount) {
        this.totalTextBookCount = totalTextBookCount;
    }

    public int getLentCount() {
        return lentCount;
    }

    public void setLentCount(int lentCount) {
        this.lentCount = lentCount;
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
        System.out.print("Nhap tong so luong sach:\t");
        setTotalTextBookCount(Integer.valueOf(scanner.nextLine()));
        System.out.print("Nhap so luong muon:\t");
        setLentCount(Integer.valueOf(scanner.nextLine()));
        this.remaining();
        scanner.close();
    }

    @Override
    public void remaining() {
        remaining = getTotalTextBookCount() - getLentCount();
    }

    @Override
    public String toString() {

        return super.toString() + " pageNumber=" + pageNumber + ", status=" + status + ", totalTextBookCount="
                + totalTextBookCount + ", lentCount=" + lentCount +", remaining=" + remaining;
    }

    @Override
    public void position() {
        Random random = new Random();
        System.out.printf("Vi tri cua do an o ke so %d\n", random.nextInt(10)+1);
    }



}