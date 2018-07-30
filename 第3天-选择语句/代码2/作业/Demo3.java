/*
3.从键盘接收一个名次(int)  使用switch-case作如下分支

*/
import java.util.Scanner;
public class Demo3{
	public static void main(String[] args){
		//1创建input对象
		Scanner input=new Scanner(System.in);
		//2提示
		System.out.println("请输入您的名次");
		int level=input.nextInt();
		switch(level){
			case 1:
				System.out.println("奖励iphone8一个");
				break;
			case 2:
				System.out.println("奖励iphone7一个");
				break;
			case 3:		
				System.out.println("奖励iphone6一个");
				break;
			case 4:
				System.out.println("奖励iphone5一个");
				break;
			default:
				System.out.println("继续努力");
				break;
		}
	}
}