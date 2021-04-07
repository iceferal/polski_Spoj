import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Power_it {

    static public void flower(BigInteger iks, BigInteger y, BigInteger z) {
        String pow = y.toString(2);
        BigInteger result = BigInteger.valueOf(1);
        BigInteger a = iks.mod(z);
        BigInteger x = a;
        for(int i = pow.length()-1; i>=0; i--) {
            if(pow.charAt(i) == '1') {
                result = result.multiply(x);
                result = result.mod(z);            }
            x = x.multiply(x);
            x = x.mod(z);        }
        System.out.println(result);
    }    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hw = scanner.nextInt();
        for(int i =0; i<hw; i++) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            BigInteger c = scanner.nextBigInteger();
            flower(a, b, c);
        }
        scanner.close();
    }
}
