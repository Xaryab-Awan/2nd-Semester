package Q3;

public class Main {
    public static <T extends Comparable<T>> T compare(T[] array){
        T max = array[0];
        for (int i=0;i<array.length;i++){
            if(array[i].compareTo(max)>0){
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] marks = {3,4,1,6,7};
        System.out.println(compare(marks));
    }

}
