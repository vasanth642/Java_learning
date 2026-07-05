package binarySearch.interviewQuestions;

public class floorOfNumber {
   public static void main(String[] args) {
       int[] arr = {23,23,56,78,89};
       int target = 23;
       int ans = flooring(arr,target);
       System.out.println(ans);
   }

   static int flooring(int[] arr, int target) {

       //this is for handling edge cases,what if the target is not present in the array,like it the smaller than the smallest number in the array
       if(target < arr[0]) {
           return -1;
       }
       int start = 0;
       int end = arr.length -1;

       while(start<=end) {
           int mid = start + (end - start)/2;
           if (target >= arr[mid]) {
               start = mid + 1;
            }else  {
               end  = mid - 1;
           }
        }
        return end;
   }
}
