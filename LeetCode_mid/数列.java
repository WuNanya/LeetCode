import java.util.*;
public class ReorderOddEven {
	public static void main(String[] args){
		long startTime = System.currentTimeMillis(); //获取当前时间
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()){
			int l = scan.nextInt();
			int r = scan.nextInt();
			int count1 = 0;
			int count2 = 0;
			
			if(l > r){
				System.out.println(count1);
			}
			
			if(l%3 != 0){
					count1 = (l/3)*2;
			}
			else{
				count1 = (l/3)*2-1;
			}
			if(r%3 != 0){
				count2 = (r/3)*2+(r%3)-1;
			}
			else{
				count2 = (r/3)*2;
			}
			System.out.println(count2-count1);
			
		}
		long endTime = System.currentTimeMillis();
		System.out.println("程序运行时间："+(endTime-startTime)+"ms");
	}
}
