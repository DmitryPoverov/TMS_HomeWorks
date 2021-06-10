package HW.Task8;

class User {

    private String name;
    private String login;
    private String password;
    private Basket userBasket;

    protected User(String name) {
        this.name = name;
        userBasket = new Basket();
    }

    public void addToUserBasket(Commodity item) {
        userBasket.addItemToBasket(item);
    }

    protected void showBasket() {
        System.out.println("User: " + name + "\nHis basket:\n");
        System.out.println(name + "'s basket:");
        for (int i=0; i<userBasket.getBasket().length; i++) {
            System.out.println("Commodity: " + userBasket.getBasket()[i].getName() +
                    ". Its price: " + userBasket.getBasket()[i].getPrice());
        }


//        for(Commodity comm : userBasket.getBasket()) {
//            if (comm.getName()!=null) {
//                System.out.println("User: " + comm.getName() + ". Its price: " + comm.getPrice());
//            }
//        }
        System.out.println();
    }

}
