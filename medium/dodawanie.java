import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class dodawanie {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hm = scanner.nextInt();
        for(int i=0; i<hm; i++) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            System.out.println(a.add(b));
        }
    }
}
