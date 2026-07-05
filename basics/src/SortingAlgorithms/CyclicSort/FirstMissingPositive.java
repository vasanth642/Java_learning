package SortingAlgorithms.CyclicSort;

//this is a leetcode(41) hard question and been asked in amazon
//the main thing why this question is hard is because
//here the range is not given like from 0 -> N or 1 -> N
//and also this question has negative numbers in the array

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr ={3,4,-1,1};
        int result = findFirstMissingPositive(arr);
        System.out.println(result);
    }
    public static int findFirstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
            else {
                i++;
            }
        }

        for(int index = 0;index < nums.length;index++) {
            if(nums[index] != index + 1) {
                return index + 1;
            }
        }
        return nums.length + 1;
    }
}
