import java.text.DecimalFormat;
import java.util.*;
import java.io.*;
import java.text.*;

public class Rownanie_liniowe {
    
    public static void count(float a, float b, float c) {
        float zero = 0f;
        String result = "";
        float score = 0;
        if(Float.compare(a, zero) != 0) {
            score = (c - b)/a; 
            DecimalFormat format = new DecimalFormat("###.##"); }
        else if((Float.compare(a, zero) == 0) && (Float.compare(b, zero) == 0))
            result = "NWR";
        else if((Float.compare(a, zero) == 0) && (Float.compare(b, zero) != 0))
            result = "BR";            
        System.out.format(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        count(a, b, c);
    }
}
