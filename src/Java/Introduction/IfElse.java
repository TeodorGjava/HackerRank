package Java.Introduction;

import java.util.Scanner;

public class IfElse {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if (N > 20) {
            System.out.println("Not Weird");
        }
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        sc.close();
    }
}
