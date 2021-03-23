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
        String buff = String.valueOf(bufi);
        String[] upper = StringUtils.split(buff, "A-Z");
        System.out.println(upper[0]);
        System.out.println(bufi);
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
