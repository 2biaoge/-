
import java.util.Scanner;
public class ZuoYe4{
	public static void main(String[]args){
		Scanner input =new Scanner(System.in);
		System.out.println("�������һ������");
		int m =input.nextInt();
		System.out.println("�������2������");
		int n =input.nextInt();
		int num1=m;				//���Լ���������������
		int num2=n;
		while(num1%num2!=0){
			int temp =num1%num2;
			num1=num2;
			num2=temp;
		}
		System.out.println("���Լ���ǣ�"+num2);
		System.out.println("��С�������ǣ�"+(m*n)/num2);

	}
}