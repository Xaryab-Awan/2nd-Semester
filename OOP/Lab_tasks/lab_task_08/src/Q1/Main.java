package Q1;

public class Main {
    public static void main(String[] args) {
        Book book=new Book("HarryPotter","Xaryab",2025,"3055","HP publishers");
        Magazine magazine=new Magazine("DailyDawn","Arham",2025,"Dawn News","2551");
        DVD dvd=new DVD("Who will carry the Boats","David Gogins",2025,"Rafay",20);
        System.out.println(book.toString());
        System.out.println(magazine.toString());
        System.out.println(dvd.toString());
    }
}
