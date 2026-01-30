public class Book {
    // ===== Thuộc tính (instance variables) =====
    private String id;
    private String title;
    private String author;
    private double price;

    // ===== Constructor (tham số TRÙNG tên thuộc tính) =====
    public Book(String id, String title, String author, double price) {
        this.id = id;         // this.id  -> biến instance
        this.title = title;   // title    -> tham số constructor
        this.author = author;
        this.price = price;
    }

    // ===== Phương thức hiển thị =====
    public void display() {
        System.out.println("ID     : " + this.id);
        System.out.println("Title  : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price  : " + this.price);
        System.out.println("----------------------------");
    }
}
