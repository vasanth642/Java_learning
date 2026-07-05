package SortingAlgorithms.CyclicSort;

// this question belongs to the leetcode 287
//this question is asked in amazon/microsoft interviews

public class findDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {2,1,2};
        int duplicate = findDuplicate(arr);
        System.out.println(duplicate);
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else {
                i++;
            }
        }

        return nums[nums.length - 1 ];
    }
}
