/*
��д���򣬸���һ��ѧ���ɼ���������Ӧ�ȼ���
90~100 ����
80~89 ����
70~79 �е�
60~69 ����
0~59 ������
ʹ����������
*/
import java.util.Scanner;
public class Demo2{
	public static void main(String[] args){
		//1����input����
		Scanner input=new Scanner(System.in);
		//2��ʾ
		System.out.println("���������ĳɼ�");
		int score=input.nextInt();
		if(score>=90){
			System.out.println("����");
		}else if(score>=80){
			System.out.println("����");	
		}else if(score>=70){
			System.out.println("�е�");
		}else if(score>=60){
			System.out.println("����");
		}else{
			System.out.println("������");	
		}
	}
}