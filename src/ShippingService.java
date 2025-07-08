public class ShippingService {
    public static void sendPaperBook(Book book, String address) {
        if (!(book instanceof PaperBook)) {
            throw new IllegalArgumentException("error, only PaperBooks can be shipped");
        }
        System.out.println("shipping paper book: " + book.getTitle() + " to " + address);

    }
}
