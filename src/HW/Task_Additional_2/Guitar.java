package HW.Task_Additional_2;

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
