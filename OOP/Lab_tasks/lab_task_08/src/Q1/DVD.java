package Q1;

public class DVD extends Item{
    private String director;
    private int length;

    public DVD(String title, String author, int year, String director, int length) {
        super(title, author, year);
        this.director = director;
        this.length = length;
    }
    @Override
    public String toString() {
        return super.toString() + "\tDirector: " + director + "\tLength: " + length;
    }
}
