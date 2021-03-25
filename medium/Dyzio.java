import java.util.*;
import java.io.*;

public class Dyzio {

    public static void dysio(int a, int b) {
        int result = 0;
        for(int i=a; i<b+1; i++) {
            int isit = 0;
            for(int j=2; j<i/2; j++) 
                if(i % j == 0)
                    isit = 1;
            if(isit != 1)
                result++;    
        }
        System.out.println(result);
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int i=0; i<x; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            dysio(a, b);        }
    }
}
