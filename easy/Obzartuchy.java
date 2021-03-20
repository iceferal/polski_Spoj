import java.util.*;
import java.io.*;

public class Obzartuchy {
    
    public static int zarcie(int x, int y, int[] tab) {
        int result = 0;
        int finka = 0;
        int day = 86400;
        for(int i=0; i<x; i++) {
            result = result + (day / tab[i]);
            if(day % tab[i] > 0)
                result = result + 1;  }

        if(result % y > 0)
            finka = (result / y) + 1;
        else
            finka = result / y;    
        return finka;   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] tab = new int[x];
            for(int j=0; j<x; j++) {
                tab[j] = scanner.nextInt();
            }
            System.out.println(zarcie(x, y, tab));    }
    }
}
