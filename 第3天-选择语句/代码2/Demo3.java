/*
ʹ�� switch ʵ�ּ򵥵ļ�����
*/
import java.util.Scanner;
public class Demo3{
	public static void main(String[] args){
		//1����Input����
		Scanner input=new Scanner(System.in);
		//2��ʾ
		System.out.println("�������һ������");
		int a=input.nextInt();
		System.out.println("������һ�������");
		String op=input.next();
		System.out.println("������ڶ�������");
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
					System.out.println("��������Ϊ0");
				}
				
				break;
			case "%":
				System.out.println(a+"%"+b+"="+(a%b));
				break;
			default:
				System.out.println("�������");		
				break;
			
		}
	}
}