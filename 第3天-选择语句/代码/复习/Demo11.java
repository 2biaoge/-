/*
���󣺴ӿ���̨����ѧԱ3�ſγ̳ɼ�(html��java��sql)����д����ʵ��

	
��1��Java�κ�SQL�εķ���֮��

	
��2��3�ſε�ƽ����

*/
import java.util.Scanner;//����Scanner��
public class Demo11{
	public static void main(String[] args){
		//1����input���󣨱�����
		Scanner input=new Scanner(System.in);
		//2��ʾ
		System.out.println("������html�ĳɼ�:");
		//3����
		int html=input.nextInt();
		//4��ʾ
		System.out.println("������java�ĳɼ�");
		int java=input.nextInt();
		//5��ʾ
		System.out.println("������sql�ĳɼ�");
		int sql=input.nextInt();

		//java��sql�ķ�����
		int diff=java-sql;
		//ƽ����
		double avg=(double)(java+html+sql)/3;

		System.out.println("java��sql�ķ�������:"+diff);
		System.out.printf("���ſγ̵�ƽ������:%.2f",avg);
		
		
	}
}