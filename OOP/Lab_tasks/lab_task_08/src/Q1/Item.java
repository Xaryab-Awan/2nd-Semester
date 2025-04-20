package Q1;

public class Item {
    protected String title;
    protected String author;
    protected int year;

    public Item(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString(){
        return "TITLE: "+title + "\t Author: " + author + "\t Year: " + year;
    }


}
