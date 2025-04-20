package Q2;

public class A extends Marks{
    float marks1;
    float marks2;
    float marks3;

    public A(float marks1, float marks2, float marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    float get_Percentage(){
        return (((marks1+marks2+marks3)*100)/300);
    }
}
