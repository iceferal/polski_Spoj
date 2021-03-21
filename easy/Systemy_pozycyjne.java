import java.util.*;
import java.io.*;
import java.lang.*;

public class Systemy_pozycyjne {

    public static void pozycja(int a) {
        String eleven = "";
        int tmp = a;
        String[] tab = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A"};
        while(tmp > 0) {
            int b = tmp % 11;
            eleven = eleven + tab[(tmp % 11)];
            tmp = tmp / 11;        }
        StringBuilder result = new StringBuilder();
        result.append(eleven);
        System.out.println(Integer.toHexString(a).toUpperCase() + " " + result.reverse());
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            int x = scanner.nextInt();
            pozycja(x);        }
    }
}
