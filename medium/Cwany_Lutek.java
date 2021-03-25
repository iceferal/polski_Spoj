import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Cwany_Lutek {

    public static void lutek(BigInteger a, BigInteger b) {
        if(a.compareTo(b) == 0) 
            System.out.println("N");       
        else if(a.compareTo(b) < 0)
            System.out.println("P");    
        else if(a.compareTo(b) > 0) {
            int result = 1;
            for(int i=b.intValue(); i<a.intValue(); i++) {
                result = (result * i) % 100; }
            if(result == 0)
                System.out.println("P"); 
            else 
                System.out.println("N");    
        }    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int i=0; i<x; i++){
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            lutek(a, b);        }
    }
}
