package Q7;

public class Main {
    public static void main(String[] args) {
        Book BookDemo=new Book();
        BookDemo.setTitle("HarryPorter and the prisnor of askaban");
        BookDemo.setAuthor("Harryporter");
        BookDemo.setPrice(111);
        System.out.println(BookDemo.getTitle()+" "+BookDemo.getAuthor()+" $"+BookDemo.getPrice());
        Book DemoBook=new Book("Kotlin","Harry Parket",99);
        System.out.println(DemoBook.getTitle()+" "+DemoBook.getAuthor()+" $"+DemoBook.getPrice());
    }

}
