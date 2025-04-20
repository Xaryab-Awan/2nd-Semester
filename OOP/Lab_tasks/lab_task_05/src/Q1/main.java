package Q1;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

    class main {
        private String orderId;
        private String customerName;
        private String customerAddress;
        private List<Product> products;

        public main(String var1, String var2, String var3) {
            this.orderId = var1;
            this.customerName = var2;
            this.customerAddress = var3;
            this.products = new ArrayList();
        }

        public void addProduct(Product var1) {
            this.products.add(var1);
        }

        public List<Product> getProducts() {
            return new ArrayList(this.products);
        }

        public String getOrderId() {
            return this.orderId;
        }

        public String getCustomerName() {
            return this.customerName;
        }

        public String getCustomerAddress() {
            return this.customerAddress;
        }

        public void displayOrderDetails() {
            System.out.println("Order ID: " + this.orderId);
            System.out.println("Customer Name: " + this.customerName);
            System.out.println("Customer Address: " + this.customerAddress);
            System.out.println("Products:");

            for(Product var2 : this.products) {
                System.out.println("  Product ID: " + var2.getProductId());
                System.out.println("  Name: " + var2.getName());
                System.out.println("  Price: PKR" + var2.getPrice());
                System.out.println("  Stock Quantity: " + var2.getQuantity());
                System.out.print("  Categories: ");

                for(Category var4 : var2.getCategories()) {
                    PrintStream var10000 = System.out;
                    String var10001 = var4.getName();
                    var10000.print(var10001 + " - " + var4.getDescription() + ", ");
                }

                System.out.println("\n");
            }

        }
    }


