/*
���������ֵ����Լ������С������
*/
import java.util.Scanner;
public class Demo4{
	public static void main(String[] args){
		//1����Input����
		Scanner input=new Scanner(System.in);	
		//2��ʾ
		System.out.println("�������һ������");
		int m=input.nextInt();
		System.out.println("������ڶ�������");
		int n=input.nextInt();
		int num1=m;
		int num2=n;
		while(num1%num2!=0){
			int temp=num1%num2;
			num1=num2;
			num2=temp;
		}
		System.out.println("���Լ����:"+num2);

		System.out.println("��С��������:"+(m*n)/num2);
		
	}
}
