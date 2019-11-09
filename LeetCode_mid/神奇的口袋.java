/*
有一个神奇的口袋，总的容积是40，用这个口袋可以变出一些物品，这些物品的总体积必须是40。有n个想要得到的物品，每个物品的体积分别是a1，a2……an。有多少种不同的选择物品的方式。
*/
import java.util.Scanner;
public class Main{
    static int[] weight;
    static int count;
    static int N;
    public static void beibao(int s,int n){
        if(s == 0){
            count++;
            return;
        }
        if(s<0||(s>0&&n<1)){
            return;
        }
        beibao(s-weight[n],n-1);
        beibao(s,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            N = sc.nextInt();
            weight = new int[N+1];
            for(int i = 1;i<=N;i++){
                weight[i] = sc.nextInt();
            }
            beibao(40,N);
            System.out.println(count);
        }
    }
}
