import java.util.Scanner;

public class Book {
    private String id;
    private String bookISBN;
    private String bookTitle;
    private String publisherName;
    private int publishedYear;

    

    public Book() {
    }

    public Book(String id, String bookISBN, String bookTitle, String publisherName, int publishedYear) {
        this.id = id;
        this.bookISBN = bookISBN;
        this.bookTitle = bookTitle;
        this.publisherName = publisherName;
        this.publishedYear = publishedYear;
    }

    // Getter & setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }


    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sach:\t");
        setId(scanner.nextLine());
        System.out.print("Nhap ma ISBN:\t");
        setBookISBN(scanner.nextLine());
        System.out.print("Nhap ten sach:\t");
        setBookTitle(scanner.nextLine());
        System.out.print("Nhap ten nha xuat ban:\t");
        setPublisherName(scanner.nextLine());
        System.out.print("Nhap nam xuat ban:\t");
        setPublishedYear(Integer.valueOf(scanner.nextLine()));
        scanner.close();
    }

    @Override
    public String toString() {
        return "id=" + id + ", bookISBN=" + bookISBN + ", bookTitle=" + bookTitle + ", publisherName=" + publisherName
                + ", publishedYear=" + publishedYear;
    }
    



    

}