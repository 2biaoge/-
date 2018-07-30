/*
编写程序，给定一个学生成绩，给出相应等级：
90~100 优秀
80~89 良好
70~79 中等
60~69 及格
0~59 不及格
使用两种作法
*/
import java.util.Scanner;
public class Demo2{
	public static void main(String[] args){
		//1创建input对象
		Scanner input=new Scanner(System.in);
		//2提示
		System.out.println("请输入您的成绩");
		int score=input.nextInt();
		if(score>=90){
			System.out.println("优秀");
		}else if(score>=80){
			System.out.println("良好");	
		}else if(score>=70){
			System.out.println("中等");
		}else if(score>=60){
			System.out.println("及格");
		}else{
			System.out.println("不及格");	
		}
	}
}