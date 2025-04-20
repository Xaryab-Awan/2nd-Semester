package Q1;

public class Book extends Item{
    private String ISBN;
    private String publisher;

    public Book(String title, String author, int year, String ISBN, String publisher) {
        super(title, author, year);
        this.ISBN = ISBN;
        this.publisher = publisher;
    }
    @Override
    public String toString() {
        return super.toString() + "\tISBN: " + ISBN + "\tPublisher: " + publisher;
    }
}
