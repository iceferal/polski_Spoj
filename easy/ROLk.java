import java.util.*;
import java.io.*;

public class ROLk {
    
    public static void roll(int[] tab, int b) {
        String result = "";
        for(int i=b; i<tab.length; i++)
            result = result + tab[i] + " ";
        for(int i=0; i<b; i++)
            result = result + tab[i] + " ";
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] tab = new int[a];
        for(int i=0; i<a; i++)
            tab[i] = scanner.nextInt();
        roll(tab, b);    
    }
}
