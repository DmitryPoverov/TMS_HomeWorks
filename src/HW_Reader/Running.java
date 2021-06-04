package HW_Reader;

public class Running {

    public static void main(String[] args) {

        Reader reader0 = new Reader();
        Reader reader1 = new Reader("J J J", 123, "RTF", "08.12.1989", 1234567);
        Reader reader2 = new Reader("B B B", 456, "HTF", "28.05.1990", 2345678);
        Reader reader3 = new Reader("T T T", 789, "IGF", "15.07.1991", 3456789);

        Readers library = new Readers(reader0);
        library.addReader(reader1);
        library.addReader(reader2);
        library.addReader(reader3);

        library.showAll();

        Books book1 = new Books();
        Books book2 = new Books("Solzhenitsyn", "The archipelago Gulag");

        reader1.takeBook(3);
        reader2.takeBook("Novels", "Tales", "Encyclopedia");
        reader0.takeBook(book1);
        reader3.takeBook(book2);

        reader1.returnBook(3);
        reader2.returnBook("Novels", "Tales", "Encyclopedia");
        reader0.returnBook(book1);
        reader3.returnBook(book2);
    }
}
