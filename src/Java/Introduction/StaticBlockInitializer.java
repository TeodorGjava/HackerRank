package Introduction;

import java.util.Scanner;

public class StaticBlockInitializer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.nextLine());
        int B = Integer.parseInt(sc.nextLine());
        if(H<=0||B<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            System.out.println(B*H);
        }
    }
}
