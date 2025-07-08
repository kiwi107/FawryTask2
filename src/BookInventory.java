import java.time.Year;
import java.util.*;

public class BookInventory {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
        System.out.println("added book " + book.getTitle());
    }

    public List<Book> removeOutdatedBooks(int years) {
        List<Book> removed = new ArrayList<>();
        int currentYear = Year.now().getValue();

        List<String> outdatedIsbns = new ArrayList<>();
        for (String isbn : books.keySet()) {
            Book book = books.get(isbn);
            if (currentYear - book.getYearPublished() > years) {
                outdatedIsbns.add(isbn);
                removed.add(book);
            }
        }

        for (String isbn : outdatedIsbns) {
            books.remove(isbn);
        }

        return removed;
    }

    public double buyBook(String isbn, int quantity, Customer customer) {
        Book book = books.get(isbn);
        if (book == null) {
            throw new IllegalArgumentException("error, book not found");
        }
        if (!book.isPurchasable()) {
            throw new UnsupportedOperationException("error, book is not for sale");
        }
        double amount = book.buy(quantity, customer);
        System.out.println("successful opperation ");
        System.out.println("amount paid: " + amount);
        return amount;
    }
}
