import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Mniejsze_niz {
    
    public static void check(BigInteger[] tab, BigInteger nr) {
        int score = 0;
        int isit = 0;
        for(int i=0; i<tab.length; i++) {
            if(nr.compareTo(tab[i]) > 0)
                    score = score + 1; }
        // if(isit == 0)
        //         score++;        
        
        System.out.println(score);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hm = scanner.nextInt();
        BigInteger[] tab = new BigInteger[hm];
        for(int i=0; i<hm; i++)
            tab[i] = scanner.nextBigInteger();
        int mh = scanner.nextInt();
        // BigInteger[] tabs = new BigInteger[mh];
        for(int j=0; j<mh; j++) {    
            BigInteger nr = scanner.nextBigInteger();
            check(tab, nr);    }
    }
}
