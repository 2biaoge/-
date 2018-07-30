
import java.util.Scanner;
public class ZuoYe4{
	public static void main(String[]args){
		Scanner input =new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int m =input.nextInt();
		System.out.println("请输入第2个数：");
		int n =input.nextInt();
		int num1=m;				//最大公约数最公倍数………？
		int num2=n;
		while(num1%num2!=0){
			int temp =num1%num2;
			num1=num2;
			num2=temp;
		}
		System.out.println("最大公约数是："+num2);
		System.out.println("最小公倍数是："+(m*n)/num2);

	}
}