
import java.util.*;

public class Palendrome {

    public static void main(String[] args) {
        Scanner im = new Scanner(System.in);
        int ar[] = new int[10];
        for (int i = 0; i < 10; i++) {
            ar[i] = im.nextInt();
        }
        int len, mul_factor, digit, num = 0;
        len = ar.length;
        for (int i = 0; i < 10; i++) {
            while (ar[i] > 0) {
                String numStr = String.valueOf(ar[i]);
                for (int j = 1; j <= numStr.length() + 1; j++) {
                    mul_factor = (int) Math.pow(10, j);
                    digit = ar[i] % mul_factor;
                    digit = (int) (digit * Math.pow(10, len - j));
                    num = num + digit;
                    ar[i] = ar[i] / 10;
                }
            }
            if (ar[i] == num) {
                System.out.println("The Number is Palindrome");
            }
        }
    }
}
