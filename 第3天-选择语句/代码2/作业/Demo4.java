/*
����һ����ݣ��ж����Ƿ�������
*/
import java.util.Scanner;
public class Demo4{
	public static void main(String[] args){
		//1��������
		Scanner input=new Scanner(System.in);
		//2��ʾ
		System.out.println("������һ�����");
		int year=input.nextInt();
		//3�ж�
		if((year%4==0&&year%100!=0) || year%400==0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��������");	
		}
	
	}
}