/*
5定义三个整型变量x,y,z，从键盘初始化变量值，判断三个变量的大小，将较大的值赋给变量max，将max输出,注意输入使用Scanner输入。
*/
import java.util.Scanner;
public class Demo5{
	public static void main(String[] args){
		//1创建Input对象
		Scanner input=new Scanner(System.in);	
		System.out.println("请输入x的值");
		int x=input.nextInt();
		System.out.println("请输入y的值");
		int y=input.nextInt();
		System.out.println("请输入z的值");
		int z=input.nextInt();

		int max=0;

		//2判断  x和y
		if(x>y){
			max=x;
		}else{
			max=y;
		}	

		//3判断 max 和z	
		if(max<z){
			max=z;
		}
		
		System.out.println("最大值是:"+max);
		
	
	}
}