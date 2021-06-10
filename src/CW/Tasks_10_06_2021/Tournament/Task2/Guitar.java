package CW.Tasks_10_06_2021.Tournament.Task2;

public class Guitar implements Instrument {

    private int stringAmount;

    public Guitar(int stringAmount) {
        this.stringAmount = stringAmount;
    }

    @Override
    public void play() {
        System.out.println("The guitar is playing\nIt has " + stringAmount + " strings.\n");
    }
}
