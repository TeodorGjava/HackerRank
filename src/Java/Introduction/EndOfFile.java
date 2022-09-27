package Java.Introduction;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNext()) {
            String input = sc.nextLine();
            while (!input.equals("Read me until end-of-file.")) {
                count++;
                System.out.println(count + " " + input);
                input = sc.nextLine();
                if (input.equals("Read me until end-of-file.")) {
                    count++;
                    System.out.println(count + " " + input);
                    break;
                }
            }
        }
    }
}
