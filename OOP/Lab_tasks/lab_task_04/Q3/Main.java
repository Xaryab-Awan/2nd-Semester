package Q3;

public class Main {
    public static void main(String[] args) {
        Product P1=new Product();
        Product P2=new Product("Laptop",1200,2);
        P1.finalize();
        P2.finalize();
    }
}
