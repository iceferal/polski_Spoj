import java.util.*;
import java.io.*;

public class Ciazowy_specjalista {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int i=0; i<x; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int result = Math.abs((12*((a+b) - (b*c))) / (c-1));
            System.out.println(result); }
    }
}