package Java.DataStructures;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOperations {
    public static void main(String []argh)
    {
        Map<String, Integer> people = new LinkedHashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            people.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(people.containsKey(s)){
                System.out.printf("%s=%d%n",s,people.get(s));
            }else{
                System.out.println("Not found");
            }
        }
    }
}
