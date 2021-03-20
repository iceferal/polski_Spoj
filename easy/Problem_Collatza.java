import java.util.*;
import java.io.*;

public class Problem_Collatza {
    
    public static int rekurencja(int b) {
        int licznik = 0;
        int x = b;
        while(x != 1) {
            if(x % 2 == 1) 
                x = 3*x + 1;
            else 
                x = x/2;    
            licznik++;    }
        return licznik;    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            int b = scanner.nextInt();
            System.out.println(rekurencja(b)); }
    }
}
