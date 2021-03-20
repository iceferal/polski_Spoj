import java.util.*;
import java.io.*;

public class Przedszkolanka {

    public static int nwd(int a, int b) {
        int enwude = 0;
        while(b != 0) {
            enwude = b;
            b = a % b;
            a = enwude; }
        return enwude;
    }

    public static int nww(int a, int b) {
        return a/nwd(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(nww(x, y));   }  
    }
    
}
