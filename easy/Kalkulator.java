import java.util.*;
import java.io.*;

public class Kalkulator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            char znak = scanner.next().charAt(0);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(znak == '+') {
                System.out.println(a+b);                }
            else if(znak == '-') {
                System.out.println(a-b);                }
            else if(znak == '*') {
                System.out.println(a*b);                }
            else if(znak == '/') {
                System.out.println(a/b);                }
            else if(znak == '%') {
                System.out.println(a%b);                }    
        }
    }
}
