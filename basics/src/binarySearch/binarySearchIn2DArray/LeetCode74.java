package binarySearch.binarySearchIn2DArray;

import java.util.Arrays;

public class LeetCode74 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int target = 11;
        System.out.println(Arrays.toString(Search(matrix,target)));
    }

    public static int[] Search(int[][] matrix,int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m * n - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            int row = mid / n;
            int col = mid % n;

            int midValue = matrix[row][col];

            if(midValue == target) {
                return new int[]{row,col};
            }

            if(midValue > target) {
                 right = mid - 1;
            }else {
                left = mid + 1;
            }
        }

        return new int[]{-1,-1};
    }

}
