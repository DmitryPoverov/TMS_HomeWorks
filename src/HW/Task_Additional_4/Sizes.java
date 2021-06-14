package HW.Task_Additional_4;

public enum Sizes {

    XXS (32) {
        public String getDescription () {
            return "A child size";
        }
    },
    XS (34),
    S (36),
    M (38),
    L (40);

    private int euroSize;

    Sizes (int e) {
        euroSize = e;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription () {
        return "An adult size";
    }
}
