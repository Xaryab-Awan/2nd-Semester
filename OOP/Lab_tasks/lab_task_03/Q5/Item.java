package Q5;
import java.util.*;
public class Item {
    public int itemId;
    public String itemName;
    private int itemPrice;
    private int stock;

    public Item(int itemId,String itemName,int itemPrice,int stock)
    {
        this.itemId=itemId;
        this.itemName=itemName;
        this.itemPrice=itemPrice;
        this.stock=stock;

    }
    Item()
    {
    }
    public int getPrice()
    {
        return itemPrice;
    }
    public int getStock()
    {
        return stock;
    }
    void Setter(int price,int stock){
        if(price<0){
            System.out.println("Invalid Price");
        }
        else {
            this.itemPrice = price;
        }
        if(stock>0){
            this.stock = stock;
        }
        else{
            this.stock = 0;
        }
    }
    public long Purchase(int quantity){
        if(quantity<stock){
            stock -= quantity;
            System.out.println(itemName+" purchased "+quantity);
            return quantity*itemPrice;
        }
        else{
            System.out.println("Insufficient Stock .Quantity is greater than stock");
            return 0;
        }
    }
    public void Display(){
        System.out.println("Item Name: "+itemName);
        System.out.println("Item Id: "+itemId);
        System.out.println("Item Price: "+itemPrice);
        System.out.println("Item Stock: "+stock);
    }

}



