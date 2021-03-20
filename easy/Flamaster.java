import java.util.*;
import java.io.*;

public class Flamaster {

    public static String wyraz(String str) {
        String score = "";
        int licznik = 1;
        String tmp = str + "0";
        for(int i=1; i<tmp.length(); i++) {
            if(tmp.charAt(i) == tmp.charAt(i-1))
                licznik++;
            else {
                if(licznik == 1) {
                    score = score + tmp.charAt(i-1);
                    licznik = 1; }
                else if(licznik == 2) {
                    score = score + tmp.charAt(i-1) + tmp.charAt(i-1);
                    licznik = 1; }
                else if(licznik > 2)   {    
                    score = score + tmp.charAt(i-1) + licznik;
                    licznik = 1; }
                // System.out.println(licznik);    
            }   }
        // System.out.println(licznik);    
        return score;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            String zygzak = scanner.next();
            System.out.println(wyraz(zygzak.toUpperCase()));   }  
    }
}
