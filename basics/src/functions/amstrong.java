package functions;

public class amstrong {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++) {
            if(isAmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isAmstrong(int num) {
        int sum = 0;
        int original = num;
        while (num > 0) {
            int rem = num %10;
            num = num / 10;
            sum =  sum + rem * rem * rem;
        }

        return sum == original;
    }
}
