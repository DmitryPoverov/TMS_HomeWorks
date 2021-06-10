package HW.Task8;

class Running {

    public static void main(String[] args) {

        Commodity itemPhone1 = new Commodity("Phone1", 100);
        Commodity itemPhone2 = new Commodity();
        itemPhone2.setName("Phone2");
        itemPhone2.setPrice(200);

        Commodity itemPhone3 = new Commodity("Phone3", 300);
        Commodity itemPhone4 = new Commodity("Phone4", 400);

        Category category1 = new Category("Phones");
        category1.addItem(itemPhone1);
        category1.addItem(itemPhone2);
        category1.addItem(itemPhone3);
        category1.addItem(itemPhone4);

        Commodity itemKitchen1 = new Commodity("Pan1", 110);
        Commodity itemKitchen2 = new Commodity("Pan2", 120);
        Commodity itemKitchen3 = new Commodity("Pan3", 130);
        Commodity itemKitchen4 = new Commodity("Pan4", 140);

        Category category2 = new Category("Kitchen ware", itemKitchen1);
        category2.addItem(itemKitchen2);
        category2.addItem(itemKitchen3);
        category2.addItem(itemKitchen4);

        User user1 = new User("User1");

        user1.addToUserBasket(itemPhone1);
        user1.addToUserBasket(itemPhone2);
        user1.addToUserBasket(itemPhone3);
        user1.addToUserBasket(itemPhone4);

        user1.addToUserBasket(itemKitchen1);
        user1.addToUserBasket(itemKitchen2);
        user1.addToUserBasket(itemKitchen3);
        user1.addToUserBasket(itemKitchen4);

        user1.showBasket();

    }
}
