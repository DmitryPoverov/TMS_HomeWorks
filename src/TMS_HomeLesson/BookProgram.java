package TMS_HomeLesson;

public class BookProgram {
    public static void main(String[] args) {

        Book book1 = new Book(Type.PHANTASY, "Cinderella", "Sh.Perrault");
        System.out.printf("Book '%s' of an author %s has a type %s", book1.name, book1.author, book1.type);

        Book book2 = new Book(Type.SCIENCE, "Exploding suns", "A.Asimov");
        System.out.printf("\nBook '%s' of an author %s has a type %s", book2.name, book2.author, book2.type);

        Book book3 = new Book(Type.SCIENCE_FICTION, "Solaris", "S.Lem");
        System.out.printf("\nBook '%s' of an author %s has a type %s", book3.name, book3.author, book3.type);

        Book book4 = new Book(Type.BELLETRISTIC, "To the lighthouse", "W.Wolf");
        System.out.printf("\nBook '%s' of an author %s has a type %s", book4.name, book4.author, book4.type);
    }
}

class Book {

    Type type;
    String name;
    String author;

    Book (Type type, String name, String author) {
        this.type = type;
        this.name = name;
        this.author = author;
    }
}

enum Type {
    SCIENCE,
    BELLETRISTIC,
    PHANTASY,
    SCIENCE_FICTION
}