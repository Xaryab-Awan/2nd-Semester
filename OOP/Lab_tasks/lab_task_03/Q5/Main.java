package Q5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item( 101,"Bread", 100, 200));
        items.add(new Item( 102,"Butter", 150, 200));
        items.add(new Item( 103,"Bun", 50, 200));

        long bill = 0;
        int choice = 0;

        do {
            System.out.println("1. Search by name \n2. Search by ID \n3. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    sc.nextLine(); // Clear the buffer
                    System.out.println("Enter the item name:");
                    String itemName = sc.nextLine();
                    boolean found = false;

                    for (Item item : items) {
                        if (item.itemName.equalsIgnoreCase(itemName)) {
                            System.out.println("Item found");
                            item.Display();
                            System.out.println("Enter the quantity to purchase:");
                            int quantity = sc.nextInt();
                            long x = item.Purchase(quantity);
                            bill += x;
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Item not found");
                    }
                }
                break;

                case 2: {
                    System.out.println("Enter the item ID:");
                    int itemId = sc.nextInt();
                    boolean found = false;

                    for (Item item : items) {
                        if (item.itemId == itemId) {
                            System.out.println("Item found");
                            item.Display();
                            System.out.println("Enter the quantity to purchase:");
                            int quantity = sc.nextInt();
                            long x = item.Purchase(quantity);
                            bill += x;
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Item not found");
                    }
                }
                break;

                case 3: {
                    System.out.println("Exiting the program");
                    break;
                }

                default: {
                    System.out.println("Invalid choice");
                    break;
                }
            }
        } while (choice != 3);

        System.out.println("Bill: " + bill);
    }
}

