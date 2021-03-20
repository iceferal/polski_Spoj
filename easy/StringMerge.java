import java.util.*;
import java.io.*;

public class StringMerge {

    public static String merge(String a, String b) {
        String result = "";
        int dl = Math.min(a.length(), b.length());
        for(int i = 0; i< dl; i++)
            result = result + a.charAt(i) + b.charAt(i);

        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            String x = scanner.next();
            String y = scanner.next();
            System.out.println(merge(x, y));   }  
    }
}
