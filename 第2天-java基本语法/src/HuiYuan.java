import java.util.Scanner;    //����Scanner����

public class HuiYuan{
	public static void main(String[]args){
Scanner input =new Scanner(System.in);      //��������
		System.out.println("��Ա�ţ�");

		int a=input.nextInt();     //��������

		int ge;
		int shi;
		int bai;
		int qian;
		
		qian = a/1000;
		bai =a/100%10;
		shi =a/10%10;
		ge =a%10;
			System.out.println("ǧλ��"+qian);
			System.out.println("��λ��"+bai);
			System.out.println("ʮλ��"+shi);
			System.out.println("��λ��"+ge);
			System.out.println("��λ�ĺͣ�"+(qian+bai+shi+ge));		
		
	}
}