package Lesson6;

public class Ability {

    private String name;



    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void displayAbility () {
        System.out.printf("Ability is %s", name);
    }
}
