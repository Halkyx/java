  
import java.util.Scanner;

public class OnlineDocument extends Book implements iDownload {
    private float size;
    private int downloadCount;
    private long price;
    private long totalMoney;

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public OnlineDocument() {

    }

    public OnlineDocument(String id, String bookISBN, String bookTitle, String publisherName, int publishedYear,
            float size, int downloadCount, Long price) {
        super(id, bookISBN, bookTitle, publisherName, publishedYear);
        this.size = size;
        this.downloadCount = downloadCount;
        this.price = price;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("Nhap dung luong:\t");
        setSize(Float.valueOf(scanner.nextLine()));
        System.out.print("Nhap tong so luot tai ve:\t");
        setDownloadCount(Integer.valueOf(scanner.nextLine()));
        System.out.print("Nhap gia thanh:\t");
        setPrice(Long.valueOf(scanner.nextLine()));
        this.totalMoney();
        scanner.close();
    }

    @Override
    public void totalMoney() {
        totalMoney = getDownloadCount() * getPrice();
    }

    @Override
    public String toString() {
        return super.toString() + " size=" + size + " downloadCount=" + downloadCount + " price=" + price
                + " totalMoney=" + totalMoney;
    }

}