import java.util.*;
import java.io.*;

public class Permutacje {

    public static void permututu(int c) {
        Set<String> strings = new TreeSet<String>();
        if(c == 1)
            System.out.println("a");
        else {            
            String buffer = "";
            String fin = "";
            for(int i=97; i<97+c; i++)
                buffer = buffer + (char)i;
            char[] bufi = buffer.toCharArray();

            for(int x=0; x<bufi.length; x++) 
                for(int y=0; y<bufi.length; y++) {
                    char[] temp = bufi;
                    char tmp = temp[x];
                    temp[x] = temp[y];
                    temp[y] = tmp;
                strings.add(String.valueOf(temp));      }
            System.out.println(strings);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int i=0; i<x; i++) {
            int a = scanner.nextInt();
            permututu(a);
        }
    }
}
