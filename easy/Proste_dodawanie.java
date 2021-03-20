import java.io.*;
import java.util.*;

public class Proste_dodawanie {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            int suma = 0;
            int x = scanner.nextInt();
            for(int j=0; j<x; j++)
                suma = suma + scanner.nextInt();
            System.out.println(suma);   }  
    }
}
