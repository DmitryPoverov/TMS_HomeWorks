package HW_Reader;

public class Reader {

    private String fIO;
    private int readerID;
    private String faculty;
    private String dataBirth;
    private int phoneNumber;

    public Reader() {
        fIO = "F I O";
        readerID = 100;
        faculty = "Faculty";
        dataBirth = "01.01.2000";
        phoneNumber = 1000000;
    }

    public String getFIO () {
        return fIO;
    }

    public int getReaderID () {
        return readerID;
    }

    public Reader(String fIO, int readerID, String faculty, String dataBirth, int phoneNumber) {
        this.fIO = fIO;
        this.readerID = readerID;
        this.faculty = faculty;
        this.dataBirth = dataBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int books) {
        System.out.printf("\nA reader #%d from %s took %d books\n", readerID, faculty, books);
        System.out.printf("About reader:\nname: %s\ndate of birth: %s\nphone number: %d\n\n", fIO, dataBirth, phoneNumber);
    }

    public void takeBook(String ... books) {
        System.out.print("A reader " + fIO + " took books: ");
        for (int i=0; i<books.length; i++) {
            System.out.print(books[i] + (i==books.length-1 ? "." : ", "));
        }
        System.out.println();
    }

    public void takeBook(Books book) {
        System.out.printf("\nA reader %s took a book '%s' of the author: %s\n", fIO, book.getBookName(), book.getAuthor());
    }

    public void returnBook(int books) {
        System.out.printf("\nA reader #%d from %s returned %d books\n\n", readerID, faculty, books);
    }

    public void returnBook(String ... books) {
        System.out.print("A reader " + fIO + " returned books: ");
        for (int i=0; i<books.length; i++) {
            System.out.print(books[i] + (i==books.length-1 ? "." : ", "));
        }
        System.out.println();
    }

    public void returnBook(Books book) {
        System.out.printf("\nA reader %s returned a book '%s' of the author: %s\n", fIO, book.getBookName(), book.getAuthor());
    }
}
