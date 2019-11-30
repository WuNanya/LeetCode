import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] res = new float[5];
        int N = sc.nextInt();
        int flag = 1;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        for (int num : list) {
            if (num % 5 == 0 && num % 2 == 0) {
                res[0] += num;
            } else if (num % 5 == 1) {
                res[1] += (num * flag);
                flag = flag * -1;
            } else if (num % 5 == 2) {
                res[2]++;
            } else if (num % 5 == 3) {
                res[3] += num;
                count++;
            } else if (num % 5 == 4) {
                if (num > res[4]) {
                    res[4] = num;
                }
            }
        }
        DecimalFormat df = new DecimalFormat("#.0");
        if (count > 1) {
            String res1 = df.format(res[3] / (count * 1.0));
            res[3] = Float.parseFloat(res1);
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] == 0) {
                System.out.print("N" + " ");
            } else if (i == 3) {
                System.out.print(res[i] + " ");
            } else if (i == res.length - 1) {
                System.out.print((int) res[i]);
            } else {
                System.out.print((int) res[i] + " ");
            }
        }
    }
}


