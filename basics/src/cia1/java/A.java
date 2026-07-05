package cia1.java;

import java.util.Scanner;
import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];

        System.out.println("Enter marks: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        // Calculate average, highest, and lowest
        int sum = 0, max = marks[0], min = marks[0];
        for (int m : marks) {
            sum += m;
            if (m > max) max = m;
            if (m < min) min = m;
        }
        double avg = (double) sum / n;

        System.out.println("Average: " + avg);
        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);

        // Sort in ascending order
        Arrays.sort(marks);

        // Display sorted list
        System.out.println("Sorted Marks: " + Arrays.toString(marks));

    }
}
