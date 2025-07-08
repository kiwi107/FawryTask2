public class MailService {
    public static void sendEBook(Book book, String email) {
        if (!(book instanceof EBook)) {
            throw new IllegalArgumentException("error, only EBooks can be sent via email");
        }
        System.out.println("sending EBook: " + book.getTitle() + " to " + email);
    }
}
