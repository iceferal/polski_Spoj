import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Not_So_Fast_Multiplication {
    
    public static void multiply(BigInteger a, BigInteger b) {
        BigInteger result = a.multiply(b);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int i=0; i<x; i++) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            multiply(a, b);
        }
    }
}
