package HW.Task6;

public class Cat extends Animal {

    private String voice;
    private int mouseCounter;

    public Cat (String food, String location) {
        super(food, location);
    }

    public Cat (String food, String location, String voice, int mouseCounter) {
        super(food, location);
        this.voice = voice;
        this.mouseCounter = mouseCounter;
    }

    public void setMouseCounter(int mouseCounter) {
        this.mouseCounter = mouseCounter;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public String makeNoise() {
        return super.makeNoise() + "This cat says: '" + voice + "'.";
    }

    @Override
    public String eat() {
        return super.eat() + "This cat likes to eat " + super.getFood() + ".";
    }

    public String howManyMise() {
        return "This cat has caught " + mouseCounter + (mouseCounter>1? " mise." : " mouse.");
    }
}
