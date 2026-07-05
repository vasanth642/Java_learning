package vasanth;

import java.util.Scanner;

public class Fibonaaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a =0 ;
        int b = 1;
        int count = 2;
        int size = 2;

        int[] fib = new int[n];
        fib[0] = a;
        fib[1] = b;
        for(int j=2;j<n;j++) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            fib[size] = b;
            size +=1;
        }


        for(int i=0;i<n;i++) {
            System.out.println(fib[i]);
        }
    }
}
