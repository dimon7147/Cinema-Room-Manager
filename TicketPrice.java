public enum TicketPrice {
    PREMIUM(10), DEFAULT(8);
    private final int price;
    TicketPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
