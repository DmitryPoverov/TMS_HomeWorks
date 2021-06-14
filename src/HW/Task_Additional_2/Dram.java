package HW.Task_Additional_2;

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
