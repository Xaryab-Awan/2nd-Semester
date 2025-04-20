package Q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MessageService messageService=new Whatsapp();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Message");
        String m1= sc.nextLine();
        System.out.println("Enter ReceiverName");
        String n1= sc.nextLine();
        messageService.Send(m1,n1);
        System.out.println( messageService.receive(m1));;
    }
}
