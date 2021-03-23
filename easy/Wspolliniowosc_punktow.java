import java.util.*;
import java.io.*;

public class Wspolliniowosc_punktow {

    public static void linijka(int[][] tab) {
        int det = tab[0][0]*tab[1][1]*tab[2][2] + tab[0][1]*tab[1][2]*tab[2][0] + tab[0][2]*tab[1][0]*tab[2][1]
                - tab[0][2]*tab[1][1]*tab[2][0] - tab[0][0]*tab[1][2]*tab[2][1] - tab[0][1]*tab[1][0]*tab[2][2];
        if(det == 0)
            System.out.println("TAK");
        else
            System.out.println("NIE");    
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            int[][] tab = new int[3][3];
            for(int j=0; j<3; j++) {
                tab[j][0] = scanner.nextInt();
                tab[j][1] = scanner.nextInt();
                tab[j][2] = 1; }
        linijka(tab);         }
    }
}
