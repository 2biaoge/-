/*
 ��������
*/
package com.qf.day08;
import java.util.Scanner;
public class TestPet2{
	public static void main(String[] args){
		System.out.println("��ӭ����xxx�����̵�.....");
		System.out.println("��ѡ����Ҫ�����ĳ������� 1 ����  2 è��");
		Scanner input=new Scanner(System.in);
		int choice=input.nextInt();
		
		Master yuhuan=new Master();
		Pet p=yuhuan.adopt(choice);
		if(p!=null){
			System.out.println("�����ɹ�");
			p.print();
			yuhuan.play(p);
			
		}else{
			System.out.println("����ʧ��");
		}
		
	}
}