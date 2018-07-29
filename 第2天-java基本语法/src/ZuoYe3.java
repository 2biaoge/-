/*
成绩score=80，如果成绩大于等于60，输出及格，如果成绩大于等于70，输出中，如果成绩大于等于80，输出良，如果成绩大于等于90，输出优秀，如果成绩小于60，输出不及格。
*/

import java.util.Scanner;

public class ZuoYe3{
	public static void main(String[]args){

		Scanner input =new Scanner (System.in);
		int score;

		String a= "优秀";
		String b= "良";
		String c= "及格";
		String d= "不及格";
	do{
		System.out.println("请输入成绩：");

		score = input.nextInt();
			if (score>=90){
				System.out.println(a);}
			else if(score>=80){
				System.out.println(b);}
			else if(score>=60){
				System.out.println(c);}
			else {
				System.out.println(d);}
		}while(score!=00);
			System.out.println("输入00程序关闭！！");
			input.close();
		
	}
}