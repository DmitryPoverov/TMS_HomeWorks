package HW.Task_Additional_4;

public class Running {
    public static void main(String[] args) {

        T_shirt dress1 = new T_shirt(Sizes.XXS, 15, "blue");
        T_shirt dress2 = new T_shirt(Sizes.L, 20, "black");
        Pants dress3 = new Pants(Sizes.S, 25, "light-blue");
        Pants dress4 = new Pants(Sizes.M, 18, "white");
        Skirt dress5 = new Skirt(Sizes.XXS, 29, "colorful");
        Skirt dress6 = new Skirt(Sizes.XS, 17, "green");
        Tie dress7 = new Tie(Sizes.L, 12, "brown");
        Tie dress8 = new Tie(Sizes.M, 30, "silver");

        Dress[] wardrobe = {dress1, dress2, dress3, dress4, dress5, dress6, dress7, dress8};

        Atelier.dressMan(wardrobe);
        Atelier.dressWoman(wardrobe);

    }
}
