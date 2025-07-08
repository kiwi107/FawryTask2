public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int yearPublished, double price, int stock) {
        super(isbn, title, yearPublished, price);
        this.stock = stock;
    }

    @Override
    public boolean isPurchasable() {
        return true;
    }

    @Override
    public double buy(int quantity, Customer customer) {
        if (quantity > stock) {
            throw new IllegalArgumentException("error, not enough stock for " + title);
        }
        stock -= quantity;
        ShippingService.sendPaperBook(this, customer.getAddress());
        return price * quantity;
    }

}
