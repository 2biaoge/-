/*
ʾ��2��Java�ɼ�����98�֣�����Html�ɼ�����80�֣���ʦ������������Java�ɼ�����100�֣�Html�ɼ�����70�֣���ʦҲ���Խ�������
*/
import java.util.Scanner;
public class Demo2{
	public static void main(String[] args){
		//1����input����
		Scanner input=new Scanner(System.in);
		//2��ʾ
		System.out.println("������java�ɼ�");
		int java=input.nextInt();
		System.out.println("������html�ɼ�");
		int html=input.nextInt();

		if((java>98&&html>80)||(java==100&&html>70)){
			System.out.println("����һ������");
		}
		
			
	}
}