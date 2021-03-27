import java.util.*;
public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        for(int i=1; i<n+1; i++)
            s = s + i;
        System.out.println(s);  
    }
}
