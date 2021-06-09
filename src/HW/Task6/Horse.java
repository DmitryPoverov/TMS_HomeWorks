package HW.Task6;

public class Horse extends Animal {

    private String voice;
    private int maneLength;

    public Horse (String food, String location, String voice, int maneLength) {
        super(food, location);
        this.voice = voice;
        this.maneLength = maneLength;
    }

    @Override
    public String makeNoise() {
        return super.makeNoise() + "This horse says: '" + voice + "'.";
    }

    @Override
    public String getFood() {
        return super.getFood();
    }

    @Override
    public String eat() {
        return super.eat() + "This horse likes to eat " + super.getFood() + ".";
    }

    public String maneLength() {
        return "This horse has a mane of a " + maneLength + " cm long.";
    }
}