/*
break在switch中的使用
*/
import java.util.Scanner;
public class Demo2{
	public static void main(String[] args){
		//1创建input对象
		Scanner input=new Scanner(System.in);	
		//2提示
		System.out.println("请输入一个数字");
		int num=input.nextInt();
		//3switch
		switch(num){
			case 1:
				System.out.println("吃饺子");
				break;
			case 2:
				System.out.println("吃汤圆");
				break;
			case 3:	
				System.out.println("吃猪蹄");
				break;
			default:
				System.out.println("不吃，减肥");
				break;
		}	
	}
}