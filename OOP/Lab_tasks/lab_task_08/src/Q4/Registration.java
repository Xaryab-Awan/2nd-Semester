package Q4;

public class Registration {

     public void registration(String name,String CompetitionCategory){
         System.out.println("Single Registration Completed for "+name+" in Competition "+CompetitionCategory);
     }

    public void registration(String name,int nofMembers,String CompetitionCategory){
        System.out.println("Team Registration Completed for team "+name+"of "+nofMembers+ "members in Competition "+CompetitionCategory);
    }
    public void registration(String name,int no_of_participants){
        System.out.println("Bulk Registration Completed for university "+name+" of "+no_of_participants+" number of participants");
    }
    public void registration(String name,String company,String expertise){
        System.out.println("Expert Registration Completed ");
    }
    public void registration(String name,char  Designation){
        System.out.println("Vip Registration Completed for "+name);
    }
}
