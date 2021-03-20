import java.util.*;
import java.io.*;

public class Zabawne_Dodawanie_Piotrusia {

    public static int revers(int a) {
        int rev = 0;
        int x = a;
        while(x != 0) {
            rev = rev * 10;
            rev = rev + x%10;
            x = x/10; }
        return rev;  }

    public static int isPali(int a) {
        int isPal = 1;
        String pal = Integer.toString(a);
        char[] pali = pal.toCharArray();
        for(int i=0; i<pali.length / 2; i++) {
            if(pali[i] != pali[pali.length - 1 - i])
                isPal = 0;  }
        return isPal;  }

    public static String piter(int x) {
        String result = "";
        int tmp = x;
        int licznik = 0;
        if(isPali(tmp) == 1)
            result = result + tmp + " " + licznik;
        else {
            while(isPali(tmp) != 1) {
                tmp = tmp + revers(tmp);
                licznik++;   }
            result = result + tmp + " " + licznik;   }    
        return result;  }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    for(int i=0; i<a; i++) {
        int x = scanner.nextInt();
        System.out.println(piter(x));   }  
    }
}
