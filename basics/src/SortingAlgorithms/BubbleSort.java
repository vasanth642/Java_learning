package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,1,5,2,4,2};
        bubbleS(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleS(int[] arr) {
        boolean swap;
        for(int i = 0;i<arr.length;i++) {
            swap = false;
            for(int j = 1;j<arr.length - i;j++) {
                if(arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j- 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
    }
}
