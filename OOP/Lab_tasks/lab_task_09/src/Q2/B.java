package Q2;

public class B extends Marks{
    float marks1;
    float marks2;
    float marks3;
    float marks4;

    public B(float marks1, float marks2, float marks3, float marks4) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }
    float get_Percentage(){
        return (((marks1+marks2+marks3+marks4)*100)/300);
    }
}
