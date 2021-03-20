import java.util.*;
import java.io.*;

public class Czy_umiesz_potegowac {
    
    public static int power(int x, int y) {
        int[][] koncowki = {
            {0,0,0,0},
            {1,1,1,1},
            {6,2,4,8},
            {1,3,9,7},
            {6,4,6,4},
            {5,5,5,5},
            {6,6,6,6},
            {1,7,9,3},
            {6,8,4,2},
            {1,9,1,9} };

        return koncowki[x%10][y%4];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=0; i<a; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(power(x, y));   }  
    }
}
