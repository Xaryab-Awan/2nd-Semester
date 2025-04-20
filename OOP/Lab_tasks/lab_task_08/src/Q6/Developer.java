package Q6;

public class Developer {
    public void assignTask(String name,String Deadline){
        System.out.println(name+ " is assigned task within deadline of "+Deadline);
    }

    public void assignTask(String name,String Deadline,String priorityLevel){
        System.out.println(name+ " is assigned task within deadline of "+Deadline+" with priority level of "+priorityLevel);

    }

    public void assignTask(String name,String Deadline,String priorityLevel,String estimatedCompletionTime){
        System.out.println(name+ " is assigned task within deadline of "+Deadline+" with priority level of "+priorityLevel+" and estimated time of "+estimatedCompletionTime);


    }
}
