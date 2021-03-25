import java.util.*;
import java.io.*;

public class Lamacz_gg {
    
    public static void gugu(String linja) {
        String parts = "";
        for(int i=0; i<linja.length()/2; i++) {
            char[] temp = linja.substring(2*i, 2*i+2).toCharArray();
            // if(temp[1] == 'G') {
            //     int ascii = (int)temp[0] - 1;
            //     parts = parts + (char)ascii; }
            // else if(temp[1] == 'H') {
            //     int ascii = (int)temp[0] + 15;
            //     parts = parts + (char)ascii; }  
            int ascii = (int)temp[0] + (int)temp[1];
            parts = parts + (char)ascii;
            System.out.println((char)ascii);
            }
        System.out.println(parts.toLowerCase());        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String linja = scanner.nextLine();
            gugu(linja);       }
    }
}
