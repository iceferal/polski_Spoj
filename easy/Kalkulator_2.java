import java.util.*;
import java.io.*;

public class Kalkulator {
    
    public static void main(String[] args) {
        int[] tab = new int[10];
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            char znak = scanner.next().charAt(0);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(znak == 'z'){
                tab[a] = b;            }
            else if(znak == '+') {
                System.out.println(tab[a]+tab[b]);                }
            else if(znak == '-') {
                System.out.println(tab[a]-tab[b]);                }
            else if(znak == '*') {
                System.out.println(tab[a]*tab[b]);                }
            else if(znak == '/') {
                System.out.println(tab[a]/tab[b]);                }
            else if(znak == '%') {
                System.out.println(tab[a]%tab[b]);                }    
        }
    }
}