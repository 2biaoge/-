/*
ʹ��switch �ж� �����ﶬ
*/
import java.util.Scanner; //����Scanner��
public class Demo2{
	public static void main(String[] args){
		//1����input����
		Scanner input=new Scanner(System.in);
		System.out.println("������һ������");
		String season=input.next();	
		switch(season){	
			case "����":
				System.out.println("����");
				break;
			case "����":
				System.out.println("��Ӿ");
				break;
			case "����":
				System.out.println("����");
				break;
			case "����":
				System.out.println("����");
				break;
			default:
				System.out.println("�������...");
				break;
		}
	}
}