/*
�ɼ�score=80������ɼ����ڵ���60�������������ɼ����ڵ���70������У�����ɼ����ڵ���80�������������ɼ����ڵ���90��������㣬����ɼ�С��60�����������
*/

import java.util.Scanner;

public class ZuoYe3{
	public static void main(String[]args){

		Scanner input =new Scanner (System.in);
		int score;

		String a= "����";
		String b= "��";
		String c= "����";
		String d= "������";
	do{
		System.out.println("������ɼ���");

		score = input.nextInt();
			if (score>=90){
				System.out.println(a);}
			else if(score>=80){
				System.out.println(b);}
			else if(score>=60){
				System.out.println(c);}
			else {
				System.out.println(d);}
		}while(score!=00);
			System.out.println("����00����رգ���");
			input.close();
		
	}
}