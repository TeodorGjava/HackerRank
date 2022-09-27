package Java.Strings;

import java.util.Scanner;

public class StringTokens {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();

        String[] tokens = s.split("[\\s+\\W]+");
        scan.close();

        System.out.println(tokens.length);
        for (String token : tokens) {

            System.out.println(token);
        }
    }
}


