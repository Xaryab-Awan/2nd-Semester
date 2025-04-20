import java.util.*;
public class Q1 {
    static public void main(String[] args)
    {
       int[] arr={1,2,3,4,5};
       int temp=0;
       for(int i=0;i< arr.length;i++)
       {
           if(arr[i]>temp)
           {
               temp=arr[i];
           }
       }
        System.out.println("maximum Number in array is "+temp);;

    }
}
