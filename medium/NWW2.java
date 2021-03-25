import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class NWW2 {

    public static void enwuwu(BigInteger[] tab) {



    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            int b = scanner.nextInt();
            BigInteger[] tab = new BigInteger[b];
            for(int j=0; j<b; j++) {
                tab[j] = scanner.nextBigInteger();
            }
            enwuwu(tab);
        }
    }
}
