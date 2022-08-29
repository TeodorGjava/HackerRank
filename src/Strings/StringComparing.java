package Strings;

import java.util.Scanner;

public class StringComparing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        if (A.charAt(0) > B.charAt(0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String firstWord = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        String secondWord = Character.toUpperCase(B.charAt(0)) + B.substring(1);
        System.out.println(firstWord + " " + secondWord);
    }
}
