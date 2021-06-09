package HW.Task6;

public class Dog extends Animal {

    private String voice;
    private int criminalCounter;

    public Dog (String food, String location) {
        super(food, location);
    }

    public Dog (String food, String location, String voice, int criminalCounter) {
        super(food, location);
        this.voice = voice;
        this.criminalCounter = criminalCounter;
    }

    public void setCriminalCounter(int criminalCounter) {
        this.criminalCounter = criminalCounter;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public String getFood() {
        return super.getFood();
    }

    @Override
    public String makeNoise() {
        return super.makeNoise() + "This dog says: '" + voice + "'.";
    }

    @Override
    public String eat() {
        return super.eat() + "This dog likes to eat " + super.getFood() + ".";
    }

    public String howManyCriminals() {
        return "This dog has caught " + criminalCounter + (criminalCounter>1? " criminals." : " criminal.");
    }
}