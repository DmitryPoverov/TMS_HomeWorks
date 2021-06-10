package HW.Task8;

class Basket {

    private Commodity[] basket;
    private int counter;


    protected Basket() {
        counter = 0;
        basket = new Commodity[counter+1];
    }

        public Commodity[] getBasket() {
        return basket;
    }

    protected void addItemToBasket(Commodity item) {
        if (counter<basket.length) {
            basket[counter++] = item;

        } else if (counter==basket.length) {
            Commodity[] temp = new Commodity[basket.length];
            for (int i=0; i<basket.length; i++) {
                temp[i] = basket[i];
            }
            basket = new Commodity[counter+1];
            for (int i=0; i<temp.length; i++) {
                basket[i] = temp [i];
            }
            basket[counter++] = item;
        }
    }

}
//package HW.Task8;
//
//class Basket {
//
//    private Commodity[] basket;
//    private int counter = 0;
//
//
//    protected Basket() {
//        basket = new Commodity[2];
//    }
//
//    public Commodity[] getBasket() {
//        return basket;
//    }
//
//    protected void addItemToBasket(Commodity item) {
//        if (counter<basket.length) {
//            basket[counter++] = item;
//        } else if (counter==basket.length){                     // расширение корзины, если мало места
//            System.out.println("Increasing of the basket");
//            Commodity[] temp = new Commodity[basket.length];
//            System.arraycopy(basket, 0, temp, 0, basket.length);
//            basket = new Commodity[basket.length*2];
//            System.arraycopy(temp, 0, basket, 0, basket.length);
//            basket[counter++] = item;
//        }
//    }
//
//}
