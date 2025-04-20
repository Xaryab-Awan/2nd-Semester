package Q3;

public class Product {
    String Name;
    int Price;
    int Quantity;

    Product()
    {
        System.out.println("Default Product");
        Name="Generic";
        Price=0;
        Quantity=1;
        System.out.println("Name: "+Name);
        System.out.println("Price: "+Price);
        System.out.println("Quantity: "+Quantity );
    }
    Product(String Name,int Price,int Quantity)
    {
        this.Name=Name;
        this.Quantity=Quantity;
        this.Price=Price;
        System.out.println("Name: "+Name);
        System.out.println("Price: "+Price);
        System.out.println("Quantity: "+Quantity );
    }
    public void finalize()
    {
        System.out.println("Product Removed From Cart: "+ Name);
    }

}
