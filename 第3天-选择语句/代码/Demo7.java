/*
�����򳵣���ʲô�����������������ж��ٴ��

����ҵĴ���500��
�Ҿ���ʱ��

��������ҵĴ���100���Ҿ�����

���� 
����ҵĴ���50���Ҿ���������

���� 
����ҵĴ���10���Ҿ���qq

���� 
����ҵĴ��10������ ������ݰ���

*/
public class Demo7{
	public static void main(String[] args){
		int money=200;
		if(money>=500){
			System.out.println("��ʱ��");
		}else if(money>=100){
			System.out.println("����");
		}else if(money>=50){
			System.out.println("����ɳ��");
		}else if(money>=10){
			System.out.println("�������");
		}else{
			System.out.println("����ݰ���");
		}
	}
}