package HW_Reader;

public class Books {

    private String author;
    private String bookName;

    public Books() {
        author = "Author";
        bookName = "Book name";
    }

    public Books (String author, String bookName) {
        this.author = author;
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }
}
