/*
5�����������ͱ���x,y,z���Ӽ��̳�ʼ������ֵ���ж����������Ĵ�С�����ϴ��ֵ��������max����max���,ע������ʹ��Scanner���롣
*/
import java.util.Scanner;
public class Demo5{
	public static void main(String[] args){
		//1����Input����
		Scanner input=new Scanner(System.in);	
		System.out.println("������x��ֵ");
		int x=input.nextInt();
		System.out.println("������y��ֵ");
		int y=input.nextInt();
		System.out.println("������z��ֵ");
		int z=input.nextInt();

		int max=0;

		//2�ж�  x��y
		if(x>y){
			max=x;
		}else{
			max=y;
		}	

		//3�ж� max ��z	
		if(max<z){
			max=z;
		}
		
		System.out.println("���ֵ��:"+max);
		
	
	}
}