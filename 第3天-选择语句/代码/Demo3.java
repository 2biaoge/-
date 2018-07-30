/*
示例1:如果是男生就永远18岁，否则永远16岁。
*/
import java.util.Scanner;
public class Demo3{
	public static void main(String[] args){
		//1创建input对象
		Scanner input=new Scanner(System.in);
		//2提示	
		System.out.println("请输入您的性别");
		int sex=input.nextInt();	//1 表示男 0 表示女
		if(sex==1){
			System.out.println("永远18");
		}else{
			System.out.println("永远16");
		}
	}
}