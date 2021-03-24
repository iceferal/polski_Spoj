import java.util.*;
import java.io.*;

public class Spacje {

    public static void Spacja(String a) {
        StringBuilder buffer = new StringBuilder(a);
        for(int i=0; i<buffer.length(); i++)
        if(buffer.charAt(i) == ' ')
            buffer.deleteCharAt(i);
        System.out.println(buffer);       
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String linia = scanner.nextLine();
            Spacja(linia); }
    }
}
