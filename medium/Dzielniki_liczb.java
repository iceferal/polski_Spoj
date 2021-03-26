import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Dzielniki_liczb {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multi = scanner.nextInt();

        for(int i=0; i<multi; i++) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();

            if(a.mod(b) == BigInteger.valueOf(0))
                System.out.println("TAK");
            else
                System.out.println("NIE");    
        }
    }
}
