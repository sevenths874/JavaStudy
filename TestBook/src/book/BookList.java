package book;

public class BookList {
    private Book[] books = new Book[100];
    private int usedSize = 0;

    public BookList() {
        books[0] = new Book("三国演义", "罗贯中", 30, "小说");
        books[1] = new Book("水浒传", "施耐庵", 30, "小说");
        books[2] = new Book("西游记", "吴承恩", 30, "小说");
        this.usedSize = 3;
    }
    
    
}


















