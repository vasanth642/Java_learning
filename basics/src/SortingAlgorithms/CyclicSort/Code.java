package SortingAlgorithms.CyclicSort;
import java.util.Arrays;
//this is common solution for range 1 -> N numbers

public class Code {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(i != correctIndex) {
               int temp = arr[correctIndex];
               arr[correctIndex] = arr[i];
               arr[i] = temp;
            }
            else {
                i++;
            }
        }
    }
}
