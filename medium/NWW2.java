import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class NWW2 {

    public static long enwude(long a, long b) {
        while(a != b) {
            if(a > b)
                a = a - b;
            else if(a < b)
                b = b - a;    }
        return a;    }

    public static long enwuwu(long a, long b) {
        return (a*b) / enwude(a, b);    }    

    public static void enwuwu(long[] tab) {
        long result = 1;
        for(int i=0; i<tab.length; i++)
            result = enwuwu(result, tab[i]);

        System.out.println(result);
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            int b = scanner.nextInt();
            long[] tab = new long[b];
            for(int j=0; j<b; j++) {
                tab[j] = scanner.nextLong();
            }
            enwuwu(tab);
        }
    }
}
