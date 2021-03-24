import java.util.*;
import java.io.*;

public class Dlugosc_najdluzszego_wspolnego_slowa {
    
    public static void slowko(String b, String d) {
        int min = (b.length() > d.length()) ? d.length() : b.length();
        String word = (b.length() > d.length()) ? d : b;
        String m_word = (b.length() > d.length()) ? b : d;
        int licznik = 0;
        Set<String> result_a = new TreeSet<String>();
        Set<String> result_b = new TreeSet<String>();

        for(int a=0; a<word.length(); a++)
            result_a.add(String.valueOf(word.charAt(a)));
        for(int a=0; a<m_word.length(); a++)
            result_b.add(String.valueOf(m_word.charAt(a)));            

        for(String number : result_a)
            if(result_b.contains(number))
                licznik++;
        // for(String number : result_a)
        //     System.out.println(number);
        System.out.println(licznik);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int i=0; i<x; i++) {
            int a = scanner.nextInt();
            String b = scanner.next();
            int c = scanner.nextInt();
            String d = scanner.next();
            slowko(b, d);
        }
    }
}
