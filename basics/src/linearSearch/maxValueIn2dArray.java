package linearSearch;

public class maxValueIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,45,12,6},
                {1,2,3},
                {54,47,32,12}
        };

        System.out.println(maxValue(arr));
    }

    static int maxValue(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
