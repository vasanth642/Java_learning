package binarySearch.interviewQuestions;

//this is leetcode hard question but really a easy one simply and easy

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        int ans = splitArray(arr,k);
        System.out.println(ans);
    }

    public static  int splitArray (int arr[] , int k){
        int start = 0;
        int end = 0;

        for(int i = 0;i < arr.length - 1;i++) {
            start = Math.max(start,arr[i]);
            end += arr[i];
        }

        while(start < end) {
            int mid = start + (end - start) / 2;

            //after finding the mid divide the array into subarray which is less than mid the condition for dividing the sub array
            //is the code below

            int sum = 0;
            int pieces = 1;
            for(int num : arr) {
                if(sum + num > mid) {
                    //this means we need to form a new subarray
                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }
            }

            if(pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;


    }
}
