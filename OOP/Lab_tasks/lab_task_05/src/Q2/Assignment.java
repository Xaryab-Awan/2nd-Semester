package Q2;

public class Assignment {
    String title;
    String dueDate;
    private Course course;
    private boolean isCompleted;
    Assignment(String title,String dueDate){
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
        System.out.println("Assignment title:"+title);
        System.out.println("Assignment DueDate:"+dueDate);
    }
}

