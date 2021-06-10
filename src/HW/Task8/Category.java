package HW.Task8;

class Category {

    private String categoryName;
    private Commodity[] categoryItems;
    private int counter=0;

    protected Category(String categoryName) {
        this.categoryName = categoryName;
        categoryItems = new Commodity[3];
    }

    protected Category(String categoryName, Commodity item) {
        this.categoryName = categoryName;
        categoryItems = new Commodity[3];
        categoryItems[0] = item;
        counter++;
    }

    protected void addItem(Commodity item) {
        if (counter<categoryItems.length) {
            categoryItems[counter++] = item;
        } else {
            System.out.printf("\nThere is no place in the '%s' category." +
                    "\nThe item '%s' with price %d was not added to the current category\n",
                    categoryName, item.getName(), item.getPrice());
        }
    }
}
