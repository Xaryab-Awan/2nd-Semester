package Q1;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class OrderManager {
    private List<main> orders = new ArrayList();

    public OrderManager() {
    }

    public void addOrder(main var1) {
        this.orders.add(var1);
    }

    public void generateReport() {
        System.out.println("===== Orders Report =====");

        for(main var2 : this.orders) {
            System.out.println("Order ID: " + var2.getOrderId());
            PrintStream var10000 = System.out;
            String var10001 = var2.getCustomerName();
            var10000.println("Customer: " + var10001 + ", Address: " + var2.getCustomerAddress());
            System.out.println("Products:");

            for(Product var4 : var2.getProducts()) {
                var10000 = System.out;
                var10001 = var4.getName();
                var10000.println("  Product: " + var10001 + " (ID: " + var4.getProductId() + ")");
                System.out.printf("  Price: $%.2f\n", var4.getPrice());
                System.out.println("  Stock Quantity: " + var4.getQuantity());
                System.out.print("  Categories: ");

                for(Category var6 : var4.getCategories()) {
                    System.out.print(var6.getName() + ", ");
                }

                System.out.println("\n");
            }

            System.out.println("--------------------------");
        }

    }
}

