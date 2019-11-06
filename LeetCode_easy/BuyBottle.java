import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()){
            int full = sc.nextInt();
            int empty = 0;
            while(full >= 2){
                empty = empty + full / 3;
                full = (full % 3) + (full / 3);
                if(full == 2){
                    full = full + 1;
                }
            }
            list.add(empty);
        }
        for(int num : list){
            System.out.println(num);
        }
    }
}
