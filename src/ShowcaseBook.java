public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int yearPublished, double price) {
        super(isbn, title, yearPublished, price);
    }

    @Override
    public boolean isPurchasable() {
        return false;
    }

    @Override
    public double buy(int quantity, Customer customer) {
        throw new UnsupportedOperationException("error, this book is for showcase only");
    }
}
