package SortingAlgorithms.CyclicSort;

import java.util.ArrayList;

//this belongs to the leetcode 442 question
//the range of the numbers is from [1 -> N]
public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> result = findDupliates(arr);
        System.out.println(result);
    }

    public static ArrayList<Integer> findDupliates(int[] nums) {
        //first we need to sort the array
        int i = 0;
        while(i < nums.length) {
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]) {
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            }else {
                i++;
            }
        }

        //after the while our array is sorted
        //the last thing is to find the duplicates

        ArrayList<Integer> result = new ArrayList<>();
        for (int j = 0; j < nums.length ; j++) {
            if(nums[j] != j + 1) {
                result.add(nums[j]);
            }
        }

        return result;
    }
}
