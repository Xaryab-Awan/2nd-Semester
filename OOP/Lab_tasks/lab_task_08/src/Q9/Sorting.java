package Q9;

public class Sorting {
    public void sort(int[] array) {
        for(int i=0;i<array.length;i++) {
            for(int j=i+1;j<array.length;j++) {
                if(array[i]>array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Array is sorted in ascending order");
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }
    public void sort(String[] array) {
        for(int i=0;i<array.length;i++) {
            for(int j=i+1;j<array.length;j++) {
                if(array[i].compareTo(array[j])>0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Array is sorted in Ascending order");
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }
    public void sort(int[] array,Boolean descending) {
        if(descending) {
            sort(array);
        }
        else {
            for(int i=0;i<array.length;i++) {
                for(int j=i+1;j<array.length;j++) {
                    if(array[i]<array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.println("Array is sorted in descending order");
            for(int i=0;i<array.length;i++) {
                System.out.println(array[i]);
            }
        }
    }
    public void sort(String[] array,Boolean descending) {
        if(descending) {
            sort(array);
        }
        else {
            for(int i=0;i<array.length;i++) {
                for(int j=i+1;j<array.length;j++) {
                    if(array[i].compareTo(array[j])<0) {
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.println("Array is sorted in descending order");
            for(int i=0;i<array.length;i++) {
                System.out.println(array[i]);
            }

        }
    }
}
