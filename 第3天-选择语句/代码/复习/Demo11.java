/*
需求：从控制台输入学员3门课程成绩(html，java，sql)，编写程序实现

	
（1）Java课和SQL课的分数之差

	
（2）3门课的平均分

*/
import java.util.Scanner;//导入Scanner类
public class Demo11{
	public static void main(String[] args){
		//1创建input对象（变量）
		Scanner input=new Scanner(System.in);
		//2提示
		System.out.println("请输入html的成绩:");
		//3输入
		int html=input.nextInt();
		//4提示
		System.out.println("请输入java的成绩");
		int java=input.nextInt();
		//5提示
		System.out.println("请输入sql的成绩");
		int sql=input.nextInt();

		//java和sql的分数差
		int diff=java-sql;
		//平均分
		double avg=(double)(java+html+sql)/3;

		System.out.println("java和sql的分数差是:"+diff);
		System.out.printf("三门课程的平均分是:%.2f",avg);
		
		
	}
}