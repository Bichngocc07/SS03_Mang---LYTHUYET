public class Book {
    private String id;
    private String title;
    private String author;
    private double price;

    public Book(String id, String title, String author, double price) {
        this.id = id;       
        this.title = title;  
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("ID     : " + this.id);
        System.out.println("Title  : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price  : " + this.price);
        System.out.println("----------------------------");
    }
}

