package Q1;
import java.util.ArrayList;
public class Order {
    private int orderId;
    private String userinfo;
    ArrayList<Product> p1;
    Order(int orderId,String info){
        this.orderId=orderId;
        this.userinfo=info;
        p1=new ArrayList<>();
    }
    void addProduct(Product p){
        p1.add(p);
    }
    void retrieveProduct(Product p){
        if(p1.contains(p)){
            p1.remove(p);
            System.out.println("removed sucessfully");
        }
        else{
            System.out.println("Product not found");
        }
    }
    void displayDetails(){
        System.out.println("order id:"+orderId);
        System.out.println("User info:"+ userinfo);
        System.out.println("Products:");
        for(Product p:p1){
            p.Display();
        }

    }
}
