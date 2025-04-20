package Q1;

import java.util.ArrayList;

public class Catogry {
    public String CatogryName;
    public String CatogryDescription;
    private ArrayList<Product> products;

    Catogry(String name,String Description){
        this.CatogryName=name;
        this.CatogryDescription=Description;
    }
    void addProduct(Product p){
        products.add(p);
    }
    void display(){
        System.out.println(CatogryName);
        System.out.println(CatogryDescription);
    }
}
