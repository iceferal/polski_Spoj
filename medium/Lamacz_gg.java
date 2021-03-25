import java.util.*;
import java.io.*;

/* zakomentowany tekst to alternatywne rozwiazanie, ale nie przyjete przez Spoja */

public class Lamacz_gg {
    
    public static void gugu(String linja) {
        String parts = "";
        char[] prim = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'};
        int[] first = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] second = {0, 16, 32, 48, 64, 80, 96, 112, 128, 144, 160, 176, 192, 208, 224, 240};
        for(int i=0; i<linja.length()/2; i++) {
            char[] temp = linja.substring(2*i, 2*i+2).toCharArray();
            // if(temp[1] == 'G') {
            //     int ascii = (int)temp[0] - 1;
            //     parts = parts + (char)ascii; }
            // else if(temp[1] == 'H') {
            //     int ascii = (int)temp[0] + 15;
            //     parts = parts + (char)ascii; }  
            int index = 0;
            for(int x=0; x<prim.length; x++)
                if(prim[x] == temp[0])
                    index = first[x];
            for(int x=0; x<prim.length; x++)
                if(prim[x] == temp[1])
                    index = index + second[x];
            parts = parts + (char)index;        }
        System.out.println(parts);        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String linja = scanner.nextLine();
            gugu(linja);       }
    }
}
