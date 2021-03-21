import java.util.*;
import java.io.*;

public class Stos {

    public static int[] add(int a, int licznik, int[] tab) {
        int[] tmp = tab;
        tmp[licznik] = a;
        return tmp;    }

    public static void main(String[] args) {
        int tab[] = new int[10];
        int licznik = 0;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            char znak = scanner.next().charAt(0);
            if(znak == '+') {
                if(licznik < 10) {
                    int a = scanner.nextInt();
                    tab = add(a, licznik, tab);
                    licznik++; 
                    System.out.println(":)"); }
                else {
                    int a = scanner.nextInt();
                    System.out.println(":(");    }            }
            else if(znak == '-') {
                if(licznik == 0)
                    System.out.println(":(");
                else if(licznik >= 0){
                    System.out.println(tab[licznik-1]);
                    licznik--;     }                }
        }
    }
}
