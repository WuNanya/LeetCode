import java.util.Arrays;
import java.util.Scanner;

public class ShiliuToBa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        String[] str = new String[num];
        for(int i = 0; i<num; i++){
            str[i] = sc.next();
        }
        for(String s : str){
            char a[] = s.toCharArray();
            for(int j = 0; j<a.length; j++){
                char n = a[a.length-1-j];
                switch (n){
                    case '1': sum = sum + (int)Math.pow(16,j);
                    break;
                    case '2': sum = sum + 2*(int)Math.pow(16,j);
                    break;
                    case '3': sum = sum + 3*(int)Math.pow(16,j);
                    break;
                    case '4': sum = sum + 4*(int)Math.pow(16,j);
                    break;
                    case '5': sum = sum + 5*(int)Math.pow(16,j);
                    break;
                    case '6': sum = sum + 6*(int)Math.pow(16,j);
                    break;
                    case '7': sum = sum + 7*(int)Math.pow(16,j);
                    break;
                    case '8': sum = sum + 8*(int)Math.pow(16,j);
                    break;
                    case '9': sum = sum + 9*(int)Math.pow(16,j);
                    break;
                    case 'A': sum = sum + 10*(int)Math.pow(16,j);
                    break;
                    case 'B': sum = sum + 11*(int)Math.pow(16,j);
                    break;
                    case 'C': sum = sum + 12*(int)Math.pow(16,j);
                    break;
                    case 'D': sum = sum + 13*(int)Math.pow(16,j);
                    break;
                    case 'E': sum = sum + 14*(int)Math.pow(16,j);
                    break;
                    case 'F': sum = sum + 15*(int)Math.pow(16,j);
                }
            }
            String eight = Integer.toOctalString(sum);
            System.out.println(eight);
            sum = 0;
        }
    }
}
