package CW.Tasks_10_06_2021.Tournament.Task1;

class Book implements Printable {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    static void printBooks (Printable[] printable) {
        for (Printable p: printable) {
            if (p instanceof Magazine) {
                p.print();
            }
        }
    }

}
