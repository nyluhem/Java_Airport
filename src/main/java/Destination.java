public enum Destination {

    EDINBURGH(90),
    BUDAPEST(150),
    MALDIVES(1000),
    NEWYORK(1800);

    private final int price;

    Destination(int price) {
        this.price = price;
    }

    //function that will return price
    public int getPrice() {
        return this.price;
    }
}
