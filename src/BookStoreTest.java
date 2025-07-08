import java.util.List;

public class BookStoreTest {
    public static void main(String[] args) {
        BookInventory inventory = new BookInventory();

        Book paperBook = new PaperBook("book1", "name1", 2020, 150, 5);
        Book eBook = new EBook("book2", "name2", 2022, 100, "PDF");
        Book showcaseBook = new ShowcaseBook("book3", "name3", 2023, 1000);

        inventory.addBook(paperBook);
        inventory.addBook(eBook);
        inventory.addBook(showcaseBook);

        Customer customer = new Customer("karim", "karimslkamel@gmail.com", "23 hegaz street, cairo");

        // corner cases
        System.out.println("");
        System.out.println("## corner cases ##");
        System.out.println("");
        System.out.println("## buying more paper books than available test");
        try {
            inventory.buyBook("book1", 100, customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");

        System.out.println("");
        System.out.println("## buying more than one eBook test");
        try {
            inventory.buyBook("book2", 3, customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");

        System.out.println("");
        System.out.println("## trying to buy a showcase book test");
        try {
            inventory.buyBook("book3", 1, customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");

        System.out.println("## buying a book that does not exist test ");
        try {
            inventory.buyBook("ay 7aga", 1, customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");

        // success cases
        System.out.println("## success cases ##");
        System.out.println("");
        System.out.println("## buying a paper book with available stock test");
        try {
            inventory.buyBook("book1", 2, customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");

        System.out.println("");
        System.out.println("## buying a valid eBook test");
        try {
            inventory.buyBook("book2", 1, customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");

        System.out.println("");
        System.out.println("## removing books older than 2 years test");
        List<Book> removedBooks = inventory.removeOutdatedBooks(2);
        System.out.println("books removed:");
        for (Book book : removedBooks) {
            System.out.println(book.getTitle());
        }
        System.out.println("");

    }

}
