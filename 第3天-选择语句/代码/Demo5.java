/*
�ϻ���ϰ2��������λ���ֵĻ�Ա�ŵİ�λ���ֵ��ڲ�����������ּ�Ϊ���˻�Ա����ʾ��ϲ���н��ˣ�����û�н���
*/
import java.util.Scanner;
public class Demo5{
	public static void main(String[] args){
		//����Input����
		Scanner input=new Scanner(System.in);
		//��ʾ
		System.out.println("��������λ�Ļ�Ա��:");
		int member=input.nextInt();

		//��λ
		int bai=member/100%10;
		int ran=(int)(Math.random()*10);   //Math.random();����0-1֮���һ�����֣���0����1 
		if(bai==ran){
			System.out.println("�н���....����ȥ��");
		}else{
			System.out.println("�úøɻ�...");
		}
	}

}