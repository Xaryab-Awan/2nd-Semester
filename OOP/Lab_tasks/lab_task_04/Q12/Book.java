package Q12;

public class Book {
    String Book_Title;
    String Author;
    int Price;

    Book(String Book_Title,String Author,int Price)
    {
        this.Author=Author;
        this.Book_Title=Book_Title;
        this.Price=Price;
    }
    Book(String Book_Title,String Author)
    {
        this.Author=Author;
        this.Book_Title=Book_Title;
        Price=0;
    }
    Book(String Book_Title)
    {
        this.Book_Title=Book_Title;
        Author="Unknown";
        Price=0;
    }
    public void DisplayDetails()
    {
        System.out.println("Book Title:"+Book_Title);
        System.out.println("Author: "+Author);
        System.out.println("Price: "+Price);
    }

}
