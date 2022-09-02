package DataStructures;

import java.util.*;

public class JavaList {
    public static void main(String[] args) {


    List<Integer> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
        list.add(sc.nextInt());
    }
    int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
        String command = sc.next();
        if (command.equals("Insert")) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(x, y);
        } else if (command.equals("Delete")) {
            int x = sc.nextInt();
            list.remove(x);
        }
    }

        for (Object o : list) {
            System.out.print(o + " ");
        }
}
}
