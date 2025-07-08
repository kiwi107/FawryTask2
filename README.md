## Summary

- Book is a base class for all types of books (superclass), have all common attributes and abstarct methods to be overridded later
- PaperBook class inherits from Book class, it is for physical books with stock, and it implements buy() method and calls ShippingService
- EBook class inherits from Book class, it is for digital books with a file type, and it implements buy() method and calls MailService
- ShowcaseBook class inherits from Book class, it is for non purchasable books, and it throws exception if buy() method is called
- Customer class represents customer details
- BookInventory class manages a map of all books handles operations for adding books, removing outdates books, and cusotmers buying books
- ShippingService simulates sending a paper book to a customer's address.
- MailService simulates emailing an ebook to a customer
- BookStoreTest contains test cases for corner case and Success cases
