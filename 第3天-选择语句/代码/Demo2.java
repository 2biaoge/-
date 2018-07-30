/*
示例2：Java成绩大于98分，而且Html成绩大于80分，老师奖励他；或者Java成绩等于100分，Html成绩大于70分，老师也可以奖励他。
*/
import java.util.Scanner;
public class Demo2{
	public static void main(String[] args){
		//1创建input对象
		Scanner input=new Scanner(System.in);
		//2提示
		System.out.println("请输入java成绩");
		int java=input.nextInt();
		System.out.println("请输入html成绩");
		int html=input.nextInt();

		if((java>98&&html>80)||(java==100&&html>70)){
			System.out.println("奖励一个鸡腿");
		}
		
			
	}
}