package CW.Tasks_10_06_2021.Tournament.Task1;

class Magazine implements Printable {

    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    static void printMagazines (Printable[] printable) {
        for (Printable p: printable) {
            if (p instanceof Magazine) {
                p.print();
            }
        }
    }
}
