/*
break��switch�е�ʹ��
*/
import java.util.Scanner;
public class Demo2{
	public static void main(String[] args){
		//1����input����
		Scanner input=new Scanner(System.in);	
		//2��ʾ
		System.out.println("������һ������");
		int num=input.nextInt();
		//3switch
		switch(num){
			case 1:
				System.out.println("�Խ���");
				break;
			case 2:
				System.out.println("����Բ");
				break;
			case 3:	
				System.out.println("������");
				break;
			default:
				System.out.println("���ԣ�����");
				break;
		}	
	}
}