package practice4;

public class BubbleSort {
    public static void main(String[] args) {


        int [] newArray ={12, 13, 14, 15, -1, 0};
        sort(newArray);
        for (int a :newArray) {
            System.out.println(a);

        }
    }
    static int temp;
    static boolean swapped;

    static void swap(int[]x,int i){
        temp = x[i];
        x[i] = x [i+1];
        x [i+1] = temp;
        swapped = true;
    }

    static int[] sort(int[] x){
        for(int j = 0; j<x.length; j++){
            swapped = false;
            for(int i = 0; i< x.length-1;i++){
                if (x [i] < x[i+1] ){
                    swap (x,i);
                }
            }
            if (swapped = false) break;
        }
        return x;
    }
    static int[] sortAsc(int[] x){
        for(int j = 0; j<x.length; j++){
            swapped = false;
            for(int i = 0; i< x.length-1;i++){
                if (x [i] > x[i+1] ){
                    swap (x,i);
                }
            }
            if (swapped = false) break;
        }
        return x;
    }
}
