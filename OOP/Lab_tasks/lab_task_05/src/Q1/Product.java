package Q1;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.List;

class Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;
    private List<Category> categories;

    public Product(String var1, String var2, double var3, int var5, List<Category> var6) {
        this.productId = var1;
        this.name = var2;
        this.price = var3;
        this.quantity = var5;
        this.categories = new ArrayList(var6);
    }

    public String getProductId() {
        return this.productId;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public List<Category> getCategories() {
        return new ArrayList(this.categories);
    }
}

