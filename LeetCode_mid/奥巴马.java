
import java.nio.charset.CharacterCodingException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int m = (int)Math.round(n/2.0);
        for(int i = 0; i < m; i++){
            if( i == 0 || i == m-1){
                for (int i1 = 0; i1 < n; i1++) {
                    System.out.print(s);
                }
            }else {
                for (int j = 0; j < n; j++) {
                    if(j == 0 || j==n-1){
                        System.out.print(s);
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
