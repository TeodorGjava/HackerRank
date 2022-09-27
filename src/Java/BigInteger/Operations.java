package Java.BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());

        BigInteger sum = a.add(b);
        BigInteger multi = a.multiply(b);

        System.out.println(sum);
        System.out.println(multi);
    }
}
