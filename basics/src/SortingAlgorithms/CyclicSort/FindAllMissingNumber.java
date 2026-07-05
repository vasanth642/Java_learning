package SortingAlgorithms.CyclicSort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

// this question belongs to the Leetcode 448 and the range
// of number is from 1 to N
public class FindAllMissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> missing = cyclicSort(arr);
        System.out.println(missing);
    }

    public static ArrayList<Integer> cyclicSort(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1) {
              result.add(j + 1);
            }
        }

        return result;
    }
}
