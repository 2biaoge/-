/*
求两个数字的最大公约数和最小公倍数
*/
import java.util.Scanner;
public class Demo4{
	public static void main(String[] args){
		//1创建Input对象
		Scanner input=new Scanner(System.in);	
		//2提示
		System.out.println("请输入第一个数字");
		int m=input.nextInt();
		System.out.println("请输入第二个数字");
		int n=input.nextInt();
		int num1=m;
		int num2=n;
		while(num1%num2!=0){
			int temp=num1%num2;
			num1=num2;
			num2=temp;
		}
		System.out.println("最大公约数是:"+num2);

		System.out.println("最小公倍数是:"+(m*n)/num2);
		
	}
}
