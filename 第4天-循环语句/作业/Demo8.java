/*
��Ʒ�۸��
       (1)�û��ӿ���̨������Ҫ��ѯ����Ʒ��ţ����ݱ����ʾ��Ӧ��Ʒ�۸�
       (2)ѭ����ѯ��Ʒ�۸�  ����Ʒ���� ���ۣ�
       (3)����n�˳�ѭ��
*/
import java.util.Scanner;
public class Demo8{
	public static void main(String[] args){
		//1����Input����
		Scanner input=new Scanner(System.in);
		//2��ʾ
		System.out.println("������Ҫ��ѯ����Ʒ���");
		String no=input.next(); //1 2  3 4 5
		while(!no.equals("n")){
			switch(no){
				case "1":
					System.out.println("iphone8\t7800");
					break;	
				case "2":
					System.out.println("�ʼǱ�\t18000");
					break;
				case "3":
					System.out.println("����\t3000");
					break;	
				case "4":
					System.out.println("���ӻ�\t5000");
					break;	
				case "5":
					System.out.println("ϴ�»�\t2000");
					break;	
				default:
					System.out.println("��������");
					break;
			}
			System.out.println("������Ҫ��ѯ����Ʒ���");
			no=input.next();
		}	
			
	}
}