package Q10;

public interface OrderPolicy {
    public void acceptOrder();
    public void calculatePreparationTime(boolean busyhours);
    public static void commonGuidelines(){
        System.out.println("Common Guidelines");
        System.out.println("Rule 1");
        System.out.println("Rule 2");
    }


}
