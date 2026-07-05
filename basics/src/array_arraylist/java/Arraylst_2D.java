package array_arraylist.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylst_2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int row = 0;row < 3;row++) {
            list.add(new ArrayList<>());
        }
        Scanner in = new Scanner(System.in);
        for (int i=0;i < 3;i++) {
            for(int j = 0;j<3;j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}