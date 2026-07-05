package array_arraylist.java;

import java.util.Arrays;

public class reversing_array {
    public static void main(String[] args) {
        int[] arr = {1,34,425,3,34,5,55,45,3,2,1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr,int index1,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
