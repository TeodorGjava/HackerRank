package BigInteger;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionSortBigDecimal {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        for (int i = 0; i < s.length-2; i++) {
            for (int j = 1; j < s.length-2; j++) {
                if (Double.parseDouble(s[j-1])<Double.parseDouble(s[j])) {
                    String temp = s[j-1];
                    s[j-1] = s[j];
                    s[j] = temp;
                }
            }
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
