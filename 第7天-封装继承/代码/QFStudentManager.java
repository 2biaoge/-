/*
QFStudent������
����ѧ����Ϣ

�޸�ѧ����Ϣ��ѧ����Ϊ�������ݣ�
*/
import java.util.Scanner;
public class QFStudentManager{
	//����ѧ����Ϣ
	public QFStudent inputStudent(){
		//1����input����
		Scanner input =new Scanner(System.in);
		//2��ʾ
		System.out.println("������ѧ����ѧ��");
		String stuNo=input.next();
		System.out.println("������ѧ��������");
		String name=input.next();
		System.out.println("������ѧ��������");
		int age=input.nextInt();
		System.out.println("������ѧ���ĵ�ַ");
		String address=input.next();

		//3����ѧ������
		QFStudent bingbing=new QFStudent();
		bingbing.name=name;
		bingbing.stuNo=stuNo;
		bingbing.age=age;
		bingbing.address=address;
		bingbing.show();
		return bingbing;//����bingbing�ĵ�ַ
	}
	//ֻ���޸�����������
	public void modify(QFStudent s){
		Scanner input=new Scanner(System.in);
		System.out.println("�������µ�����");
		String newname=input.next();
		System.out.println("�������µ�����");
		int newage=input.nextInt();
		s.name=newname;
		s.age=newage;

		s.show();

		
	}
}