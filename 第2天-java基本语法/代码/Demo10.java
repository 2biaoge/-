/*
������������ת��
�Զ�����ת�� 
byte-->short--->int--->long-->float--->double

char-->int

byte,short,char�����ڼ���ʱ��ת����int����

int���ͳ������ַ������ں���Χ�ڿ���ֱ�Ӹ�ֵ�� byte��short��int��char
*/
public class Demo10{

	public static void main(String[] args){
		byte b1=100;
		short s1=b1;
		int n=s1;
		long l=n;
		float f=l;
		double d=f;
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(d);

		//char --->int
		char c1='��';
		int num=c1;
		System.out.println(num);

		byte b2=10;
		byte b3=5;
		int b4=b2+b3;
		System.out.println(b4);

		short s2=200; //���ͳ���200 int
		short s3=32767;

		char c2=65535;
		System.out.println(c2);
	}
}