package GraphicalProgramming;

import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int m = sc.nextInt();

        int[][] marks = new int[n][m];
        int[] total = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            for (int j = 0; j < m; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
                total[i] += marks[i][j];
            }
        }

        int topper = 0;
        System.out.println("\n--- Results ---");
        for (int i = 0; i < n; i++) {
            double avg = (double) total[i] / m;
            System.out.printf("Student %d -> Total: %d | Average: %.2f%n", i + 1, total[i], avg);
            if (total[i] > total[topper]) topper = i;
        }

        System.out.println("\nTopper: Student " + (topper + 1) + " with " + total[topper] + " marks.");
        sc.close();
    }
}