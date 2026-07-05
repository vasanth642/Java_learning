package binarySearch.interviewQuestions;

public class ceilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {12,23,34,34,56,78,89};
        int target = 34;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr,int target) {
        //this is for handling edge case,what if the target is greater than the greatest number in the array
        if(target > arr[arr.length -1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length -1;

        while(start<=end) {
            int mid = start + (end - start)/2;
            if (target > arr[mid]) {
                start = mid + 1;
            }else  {
                end = mid - 1;
            }

        }
        return start;
    }
}
