import java.util.*; 
import java.io.*;

public class Liczby_Pierwsze {

    public static String isPrim(int b) {
        String result = "TAK";
        if(b == 1)
            result = "NIE";
        else {    
            for(int a=2; a<b; a++) {
                if(b % a == 0)
                    result = "NIE"; }
            }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            int b = scanner.nextInt();
            System.out.println(isPrim(b));
        }
    }
}