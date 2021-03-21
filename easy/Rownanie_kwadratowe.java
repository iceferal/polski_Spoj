import java.util.*;
import java.io.*;

public class Rownanie_kwadratowe {

    public static void delta(Float a, Float b, Float c) {
        int iks = 0;
        Float del = (b*b) - 4*a*c;
        if(del > 0)
            iks = 2;
        else if(del == 0)
            iks = 1;
        else if(del < 0)
            iks = 0;        

        System.out.println(iks);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextFloat()) {
            Float a = scanner.nextFloat();
            Float b = scanner.nextFloat();
            Float c = scanner.nextFloat();
            delta(a, b, c);
        }
    }
}
