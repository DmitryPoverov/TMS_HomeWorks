package HW.Task_Additional_1;

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
