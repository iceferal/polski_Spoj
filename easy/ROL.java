import java.util.*;
import java.io.*;

public class ROL {
    public static void rotfl(int[] tab) {
        int[] tmp = new int[tab.length];
        String temp = "";
        for(int i=1; i<tab.length; i++)
            temp = temp + tab[i] + " ";
        temp = temp + tab[0];
        System.out.println(temp);
    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            int b = scanner.nextInt();
            int[] tab = new int[b];
            for(int j=0; j<b; j++)
                tab[j] = scanner.nextInt();
            rotfl(tab); }
    }
}
