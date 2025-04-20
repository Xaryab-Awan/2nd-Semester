package Q1;

public class Magazine extends Item{
    private String publisher;
    private String issueNumber;

    public Magazine(String title, String author, int year, String publisher, String issueNumber) {
        super(title, author, year);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }
    @Override
    public String toString() {
        return super.toString()+"\tPublisher: "+publisher+"\t IssueNumber: "+issueNumber;
    }
}
