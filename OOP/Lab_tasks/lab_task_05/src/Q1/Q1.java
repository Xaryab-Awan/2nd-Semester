package Q1;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Category cosmetics = new Category("Cosmetics", "Cosmetics & Beauty Stuff");
        Category furniture = new Category("Furniture", "Luxurios Furniture");
        Product lipstick = new Product("1001", "Lipstick", 10.99, 5, List.of(cosmetics));
        Product f = new Product("1002", "Sofa-Set", 9999.99, 2, List.of(furniture));
        main order1 = new main("2551", "Malik Xaryab Awan", "Paksitan");
        order1.addProduct(lipstick);
        order1.addProduct(f);
        main order2 = new main("2552", "Abdul Rafay", "India");
        order2.addProduct(f);
        System.out.println("Order 1 Details:");
        order1.displayOrderDetails();
        System.out.println("\nOrder 2 Details:");
        order2.displayOrderDetails();
        OrderManager manager = new OrderManager();
        manager.addOrder(order1);
        manager.addOrder(order2);
        System.out.println("\nGenerating Complete Report:");
        manager.generateReport();
    }
}
