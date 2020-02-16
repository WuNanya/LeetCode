/*
网易面试题 统计能被三整除的数的数量
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        int m = 1;
        int count = 0;
        if(r == 1){
            System.out.println(count);
        }
        count = FindNum(l,r);
        System.out.println(count);
    }

    private static int FindNum(long l, long r) {
        int count = 0;
        long sum = 0;
        for(long i = 1; i < l; i++){
            sum = sum + i;
        }
        for(long i = l; i<=r; i++){
            sum = sum +i;
            if(sum % 3 == 0){
                count++;
            }

        }
        return count;
        return count

    }
}
