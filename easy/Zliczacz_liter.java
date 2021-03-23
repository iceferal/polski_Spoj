import java.util.*;
import java.io.*;

public class Zliczacz_liter {
    
    public static void liczydlo(String text) {
        StringBuilder buffer = new StringBuilder(text);
        for(int i=0; i<buffer.length(); i++)
            if(buffer.charAt(i) == ' ')
                buffer.deleteCharAt(i);
        char[] bufi = buffer.toString().toCharArray();
        Arrays.sort(bufi);
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        
        for(int c=0; c<bufi.length; c++)
            if(bufi[c] > 96)
                lower.append(bufi[c]);
            else if(bufi[c] < 96)
                upper.append(bufi[c]);
        lower.append("`");        
        upper.append("`");

        int licznik = 1;
        for(int x=1; x<lower.length(); x++) {
            if(lower.charAt(x) == lower.charAt(x-1))
                licznik++;
            else {
                System.out.println(lower.charAt(x-1) + " " + licznik);
                licznik = 1;    }        }

        licznik = 1;
        for(int x=1; x<upper.length(); x++) {
            if(upper.charAt(x) == upper.charAt(x-1))
                licznik++;
            else {
                System.out.println(upper.charAt(x-1) + " " + licznik);
                licznik = 1;    }        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst = "";
        int a = scanner.nextInt();
        for(int i=0; i<a+1; i++)
            tekst = tekst + scanner.nextLine() + " ";
        liczydlo(tekst);    
    }
}
