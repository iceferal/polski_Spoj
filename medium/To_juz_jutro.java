import java.util.*;
import java.io.*;

public class To_juz_jutro {

    public static void tomorow(int a, int b) {
        if(b % a == 0)
            System.out.println("TAK");
        else
            System.out.println("NIE");    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hm = scanner.nextInt();
        for(int i=0; i<hm; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            tomorow(a, b);        }
    }
}
