/*
3.�Ӽ��̽���һ������(int)  ʹ��switch-case�����·�֧

*/
import java.util.Scanner;
public class Demo3{
	public static void main(String[] args){
		//1����input����
		Scanner input=new Scanner(System.in);
		//2��ʾ
		System.out.println("��������������");
		int level=input.nextInt();
		switch(level){
			case 1:
				System.out.println("����iphone8һ��");
				break;
			case 2:
				System.out.println("����iphone7һ��");
				break;
			case 3:		
				System.out.println("����iphone6һ��");
				break;
			case 4:
				System.out.println("����iphone5һ��");
				break;
			default:
				System.out.println("����Ŭ��");
				break;
		}
	}
}