package CW.Tasks_10_06_2021.Tournament.Task2;

public class Trumpet implements Instrument{

    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("The trumpet is playing\nIt has a diameter " + diameter + " cm.\n");
    }

}
