import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Niezerowa_cyfra_silni {

    public static void power(int a) {
        BigInteger result = BigInteger.valueOf(1);
        for(int i=1; i<=a; i++) {
            result = result.multiply(BigInteger.valueOf(i)); }

        String fin = String.valueOf(result);
        fin = fin.replaceAll("0", "");    
        int wynik = Integer.valueOf(fin.charAt(fin.length()-1));
        
        System.out.println(fin.charAt(fin.length()-1));
    }
    
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int hw = scanner.nextInt();
        for(int i =0; i<hw; i++) {
            int a = scanner.nextInt();
            power(a);
        }
        scanner.close();
    }
}
