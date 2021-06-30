package HW3_Interfaces.Clothes;

import HW3_Interfaces.Clothes.Clothes_Interface.Jacket_Interface;
import HW3_Interfaces.Clothes.Clothes_Interface.Pants_Interface;
import HW3_Interfaces.Clothes.Clothes_Interface.Shoes_Interface;
import HW3_Interfaces.Clothes.Clothes_Interface.Thing;

import java.util.ArrayList;

public class Man {

    private int wallet;
    ArrayList<Thing> clothesList;

    public Man(int wallet) {
        this.wallet = wallet;
        clothesList = new ArrayList<>();
    }

    public void toBuyThing(Thing thing) {
        if ((wallet - thing.getPrice()) >= 0) {
            wallet-=thing.getPrice();
            clothesList.add(thing);
            System.out.println("You bought a thing.");
        } else {
            System.out.println("You don't have enough money.");
        }
    }

    public void PutAllOn() {
        System.out.println("\nYour man put on:");
        for (Thing t : clothesList) {
            t.putOn();
        }
    }

    public void takeAllOff() {
        System.out.println("Your man took off:");
        for (Thing t : clothesList) {
            t.takeOff();
        }
    }
}