package practices;
class Animal{
    String name;
    Animal(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    String name;
   Dog(){
       System.out.println("Dog");

    }
}
class Cat extends Animal{
    Cat(){
        System.out.println("Cat");
    }
}
public class practice_2 {
    public static void main(String[] args) {
        Animal a = new Dog();


    }
}