package HW.Task_Additoanal_1;

public class Running {

    public static void main(String[] args) {

        Book book1 = new Book("Book1");
        Book book2 = new Book("Book2");

        Magazine magazine1 = new Magazine("Magazine1");
        Magazine magazine2 = new Magazine("Magazine2");

        Printable[] items = {book1, book2, magazine1, magazine2};

        Magazine.printMagazines(items);
        Book.printBooks(items);
    }
}
