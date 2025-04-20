package Q1;

import java.util.ArrayList;

public class Product {
    private String productName;
    private int productId;
    private int productPrice;
    private int productQuantity;
    ArrayList<Catogry> productCategory;
    Product(String name,int id,int price,int Quantity,ArrayList<Catogry> c){
        this.productName=name;
        this.productId=id;
        this.productPrice=price;
        this.productQuantity=Quantity;
        this.productCategory=c;
        }
    void Display(){
        System.out.println("Product Name:"+productName);
        System.out.println("Product Id:"+productId);
        System.out.println("Product Quantity:"+productQuantity);
        System.out.println("Product Price:"+productPrice);
        for(Catogry c:productCategory){

        }
    }
}
