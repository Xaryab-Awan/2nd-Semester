package Q1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student std1=new Student(3055,"xaryab",19);
        Student std2=new Student(2551,"arham",19);
        ArrayList<String> M_Sports_expertise=new ArrayList<>();
        M_Sports_expertise.add("Physical Fitness");
        M_Sports_expertise.add("Team Work");
        Mentor men1=new Mentor(2899,"Rehab",4,M_Sports_expertise);
        Skills skill1=new Skills(1221,"fitness","Physically fit");
        Skills skill2=new Skills(1332,"agility","ability to move quickly and easily");
        Skills skill3=new Skills(1414,"Strength","ability to lift hard");
        ArrayList<Skills> skills=new ArrayList<>();
        skills.add(skill1);
        skills.add(skill2);
        Sports sport1=new Sports(1212,"Football","Football is played with a ball n 2 teams",skills);
        std1.Register_for_mentorship(men1);
        std1.Update_sports_interest(sport1);
        std1.View_mentor_details();
        men1.Assign_learner(std2);
        men1.Provide_guidance();
        men1.View_learners();
        men1.Remove_learner(std1);
        men1.View_learners();
        sport1.Add_skill(skill3);
        sport1.Remove_skill(skill1);
        skill1.Show_Skill_details();

    }
}
