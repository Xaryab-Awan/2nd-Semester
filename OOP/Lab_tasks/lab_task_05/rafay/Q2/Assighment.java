package Q2;

public class Assighment {
    String title;
    String dueDate;
    private Course course;
    private boolean isCompleted;
    Assighment(String title,String dueDate){
        this.title=title;
        this.dueDate=dueDate;
        this.isCompleted=false;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    public void assignmentdone(){
        isCompleted=true;
    }
    void Display(){
        System.out.println("Assighment title:"+title);
        System.out.println("Assighment DueDate:"+dueDate);
    }
}
