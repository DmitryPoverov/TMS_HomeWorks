package CW.Tasks_10_06_2021.Tournament.Task2;

public class Running {

    public static void main(String[] args) {

        Guitar item1 = new Guitar(7);
        Dram item2 = new Dram(30);
        Trumpet item3 = new Trumpet(15);

        Instrument[] orchestra = {item1, item2, item3};

        for (Instrument i: orchestra) {
            i.play();
        }
    }
}
