import java.util.Scanner;
/*
回文串问题描述：
    1.有两个字符串A和字符串B，现在需要将字符串B插入到字符串A的任意位置，使得插入后的字符串变成一个回文字符串，
    回文字符串即从前读和从后读结果都一样的字符串。
    2.例如有字符串A = aba 字符串B = b;
    那么可以构成的新字符串有baba abba abba abab由此可以看出可以构成两个回文字符串
    方法二
 */
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        boolean flag = true;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < A.length(); i++){
            sb.append(A.charAt(i));
        }
        for(int i = 0; i <= A.length(); i++){
            if(i == A.length()){
                sb.append(B);
            }else {
                sb.insert(i, B);
            }
            String str = sb.toString();
            for(int m = 0; m < str.length() / 2;m++){
                    if(str.charAt(m) != str.charAt(str.length()-1-m)){
                        flag = false;
                        break;
                    }
                }
            if(flag == true){
                count++;
            }
            flag = true;
            sb.delete(i,i+B.length());
            }
        System.out.println(count);
        }
    }
