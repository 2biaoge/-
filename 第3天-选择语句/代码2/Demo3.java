/*
使用 switch 实现简单的计算器
*/
import java.util.Scanner;
public class Demo3{
	public static void main(String[] args){
		//1创建Input对象
		Scanner input=new Scanner(System.in);
		//2提示
		System.out.println("请输入第一个数字");
		int a=input.nextInt();
		System.out.println("请输入一个运算符");
		String op=input.next();
		System.out.println("请输入第二个数字");
		int b=input.nextInt();
		switch(op){
			case "+":
				System.out.println(a+"+"+b+"="+(a+b));	
				break;
			case "-":
				System.out.println(a+"-"+b+"="+(a-b));
				break;
			case "*":
				System.out.println(a+"*"+b+"="+(a*b));
				break;
			case "/":
				if(b!=0){
					System.out.println(a+"/"+b+"="+(a/b));
				}else{
					System.out.println("除数不能为0");
				}
				
				break;
			case "%":
				System.out.println(a+"%"+b+"="+(a%b));
				break;
			default:
				System.out.println("输入错误");		
				break;
			
		}
	}
}