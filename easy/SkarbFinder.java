import java.util.*;
import java.io.*;

public class SkarbFinder {

    public static void skarbek(int[][] tab) {
        String result = "";
        String resi = "";
        int ns = 0;
        int we = 0;
        for(int i=0; i<tab.length; i++) {
            if(tab[i][0] == 0)
                ns = ns + tab[i][1];
            if(tab[i][0] == 1)
                ns = ns - tab[i][1];                    
            if(tab[i][0] == 2)
                we = we + tab[i][1];
            if(tab[i][0] == 3)    
                we = we - tab[i][1];   }
        
        if(ns > 0)                
            result = result + "0 " + ns;
        else if(ns < 0)
            result = result + "1 " + Math.abs(ns);
        if(we > 0)
            resi = resi + "2 " + we;
        else if(we < 0)
            resi = resi + "3 " + Math.abs(we);
        else if(ns == 0 && we == 0)
            result = "studnia";            
        
        if(result != "")
            System.out.println(result);
        if(resi != "")
            System.out.println(resi);    
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            int b = scanner.nextInt();
            int[][] tab = new int[b][2];
            for(int j=0; j<b; j++)
                for(int k=0; k<2; k++)
                    tab[j][k] = scanner.nextInt();
        skarbek(tab);               
        }
    }
}
