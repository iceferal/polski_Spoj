import java.util.*; 
import java.io.*;

public class Dwie_cyfry_silni {
    
    public static String silnia(int a) {
        String result = "";
        switch (a) {
            case 0:
                result = "0 1";
                break;
            case 1:
                result = "0 1";
                break;
            case 2:
                result = "0 2";
                break;
            case 3:
                result = "0 6";
                break;
            case 4:
                result = "2 4";
                break;
            case 5:
                result = "2 0";
                break;
            case 6:
                result = "2 0";
                break;
            case 7:
                result = "4 0";
                break;
            case 8:
                result = "2 0";  
                break;                                                                                                                      
            case 9:
                result = "8 0";
                break;
            default: 
                result = "0 0";        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            int b = scanner.nextInt();
            System.out.println(silnia(b));   }  
    }
}
