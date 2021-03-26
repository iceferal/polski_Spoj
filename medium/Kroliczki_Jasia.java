import java.io.*;
import java.util.*;

public class Kroliczki_Jasia {

    public static void klulik(int[] tab) {
        long[] temp = new long[tab[0]];
        temp[0] = tab[1];
        temp[1] = tab[2];
        for(int i=2; i<tab[0]; i++)
            temp[i] = (temp[i-1] + temp[i-2]) % 10;
        System.out.println(temp[temp.length-1]);    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multi = scanner.nextInt();

        for(int i=0; i<multi; i++) {
            int[] tab = new int[3];
            for(int j=0; j<3; j++)
                tab[j] = scanner.nextInt();
            klulik(tab);    
        }
    }
}
