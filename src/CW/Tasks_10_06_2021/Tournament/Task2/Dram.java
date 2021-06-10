package CW.Tasks_10_06_2021.Tournament.Task2;

public class Dram implements Instrument {

    private int size;

    public Dram(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("The dram is playing\nIt has a size " + size + " cm.\n");
    }
}
