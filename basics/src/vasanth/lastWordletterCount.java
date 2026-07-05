package vasanth;

import java.util.Scanner;
public class lastWordletterCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int value = stringCount(line);
        System.out.println(value);
    }

    public static int stringCount(String l) {
        int length = l.length() - 1;
        int count = 0;
        while (length >= 0 && l.charAt(length) == ' ' ) {
            count+=0;
            length--;
        }

        while (length >= 0 && l.charAt(length) != ' ') {
            count+= 1;
            length--;
        }

        return count;
    }
}
