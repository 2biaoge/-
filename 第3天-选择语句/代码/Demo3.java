/*
ʾ��1:�������������Զ18�꣬������Զ16�ꡣ
*/
import java.util.Scanner;
public class Demo3{
	public static void main(String[] args){
		//1����input����
		Scanner input=new Scanner(System.in);
		//2��ʾ	
		System.out.println("�����������Ա�");
		int sex=input.nextInt();	//1 ��ʾ�� 0 ��ʾŮ
		if(sex==1){
			System.out.println("��Զ18");
		}else{
			System.out.println("��Զ16");
		}
	}
}