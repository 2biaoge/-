
import java.util.Scanner;
public class LianXi1{
	public static void main( String[] args){
		Scanner input = new Scanner(System.in);
		
		double c;
		
		do{
		System.out.println("请输入成绩：");
		c= input.nextInt();	
		if(80>c & c>=60){
			System.out.println("及格");}
		else if(90>c & c>=80){
			System.out.println("中等");}
		else if(100>=c & c>=90){
			System.out.println("优秀");}
		else if(0<=c & c<60){
			System.out.println("不及格");}
		else{
			System.out.println("分数不合法！！！");}

		}while(c!=00);
			System.out.println("输入00程序关闭！！！");
			
			//input.close();   ???????????
	}

}

			//在do{  }循环里输入？
			//结束循环（c！=00）？