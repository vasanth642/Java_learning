package SortingAlgorithms.CyclicSort;
import java.util.Arrays;

//Leetcode 268 Missing Number
//amazon question
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        int missingNumber = cyclicSort(arr);
        System.out.println(missingNumber);
    }

    public static int cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                int correct = arr[i];
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else {
                i++;
            }
        }

        for(int index = 0;index < arr.length;index++) {
            if(arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }
}
