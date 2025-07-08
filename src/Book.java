public abstract class Book {
    protected String isbn;
    protected String title;
    protected int yearPublished;
    protected double price;

    public Book(String isbn, String title, int yearPublished, double price) {
        this.isbn = isbn;
        this.title = title;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract boolean isPurchasable();

    public abstract double buy(int quantity, Customer customer);

}
