import java.util.*;
import java.io.*;

public class Reprezentacja_liczb_typu_float {

    public static String reprezentacja(Float x) {
        String result = "";
        if(x == 0) {
            result = "0 0 0 0";   }
        else {    
            String temp = Integer.toHexString(Float.floatToIntBits(x)).toLowerCase();
            String tmp = temp.substring(0, 2)+" "+temp.substring(2, 4)+" "+temp.substring(4, 6)+" "+temp.substring(6);
            result = tmp.replace("00", "0"); }
    return result;
    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            String x = scanner.next();
            Float y = Float.parseFloat(x);
            System.out.println(reprezentacja(y));   } 
    }
}
