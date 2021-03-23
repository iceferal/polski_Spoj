import java.util.*;
import jaba.io.*;

public class Niekolejne {

    public static void shuffle(int next) {
        String result = "";
        if(next <=2) {
            if(next == 0)
                result = "0";
            else result = "NIE";  }
        else if(next % 2 !=0 && next > 2) {
            result = result + (next - next/2) + " ";
            for(int i=0; i<next/2; i++)
                result = result + i + " " + (next-i) + " ";
            result = result + (next - next/2 -1);    }    
        else {
            result = result + (next-next/2) + " ";
            for(int i=0; i<next - i; i++)
                result = result + i + " " + (next - i) + " ";       
        }
        System.out.println(result);   
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int next = scanner.nextInt();
        shuffle(next);
    }
}
