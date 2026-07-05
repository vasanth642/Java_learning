package SortingAlgorithms.CyclicSort;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] result = findErrorNums(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findErrorNums(int[] nums) {
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

        int[] result = new int[2];
        int k = 0;
        for (int j = 0; j < nums.length ; j++) {
            if(nums[j] != j + 1) {
                result[k] = nums[j];
                result[k + 1] = j + 1;
                k += 2;
            }
        }
        return result;
    }
}
