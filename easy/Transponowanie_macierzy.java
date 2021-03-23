import java.util.*;
import java.io.*;

public class Transponowanie_macierzy {

    public static void transpo(int[][] tab) {
        int[][] tabs = new int[tab[0].length][tab.length];
        for(int i=0; i<tab[0].length; i++)
            for(int j=0; j<tab.length; j++)
                tabs[i][j] = tab[j][i];

        for(int i=0; i<tabs.length; i++) {
            String result = "";
            for(int j=0; j<tabs[0].length; j++)
                result = result + tabs[i][j] + " ";
            System.out.println(result);            }
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] tab = new int[a][b];
        for(int i=0; i<a; i++) 
            for(int j=0; j<b; j++)
                tab[i][j] = scanner.nextInt();
        transpo(tab);    }
}
