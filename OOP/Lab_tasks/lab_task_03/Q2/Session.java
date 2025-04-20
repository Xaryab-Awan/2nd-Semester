package Q2;
import java.util.*;
public class Session {
    String sessionTitle;
    String speakerName;
    int duration;
    int roomNumber;
    void scheduleSession()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Speaker Name:");
        speakerName= obj.nextLine();
        System.out.println("Enter Room Number:");
        roomNumber=obj.nextInt();
    }
    void displaySessionDetails()
    {
        System.out.println("sessionTitle: "+sessionTitle );
        System.out.println("SpeakerName: "+speakerName );
        System.out.println("RoomNumber: "+roomNumber );
    }
}
