public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int yearPublished, double price, String fileType) {
        super(isbn, title, yearPublished, price);
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public boolean isPurchasable() {
        return true;
    }

    @Override
    public double buy(int quantity, Customer customer) {
        if (quantity != 1) {
            throw new IllegalArgumentException("error, 1 copy of ebook can be bought at a time");
        }
        MailService.sendEBook(this, customer.getEmail());
        return price;
    }

}
