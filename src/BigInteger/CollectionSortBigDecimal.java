package BigInteger;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CollectionSortBigDecimal {
    public static void main(String[] args) {


    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    String []s=new String[n+2];
        for(int i=0;i<n;i++){
        s[i]=sc.next();
    }
        sc.close();

    List<BigDecimal> decimals = Arrays.stream(s).map(str->new BigDecimal(String.valueOf(BigDecimal.valueOf(Double.parseDouble(str))))).sorted().collect(Collectors.toList());
        Collections.reverse(decimals);
     for (int i = 0; i < s.length; i++) {
        s[i] = String.valueOf(decimals.get(i));
    }
    //Output
        for(int i=0;i<n;i++)
    {
        System.out.println(s[i]);
    }
}
}
