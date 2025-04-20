package Q5;

    public class Whatsapp implements MessageService{
    public void Send(String message,String recipient){
        System.out.println("MESSAGE: "+message+ " is sent to "+recipient);
     }
     public String receive(String message){
         return "MESSAGE: "+message+" received";
     }
}
