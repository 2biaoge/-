/*
������ϰ
*/
public class Demo3{
	public static void main(String[] args){	
		sum2();
		sum3(10,20);
		int r=sum4(20,50);
		System.out.println(r);
		
		int r2=sum5(2,3,true);
	}
	//����һ������
	void sum1(){
		System.out.println("�ӷ�����1");	
	}
	//����һ������ �������ģ���̬��,�޷���ֵ���޲�
	public static void sum2(){
		System.out.println("�ӷ�����2");
	}
	
	//����һ��������������
	public static void sum3(int a,int b){
		System.out.println("�������ĺ���:"+(a+b));	
	}
	//����һ�����������������з���ֵ
	public static int sum4(int a,int b){
		return a+b;	//���ؽ������������
	}
	//����һ�����������������з���ֵ
	public static int sum5(int a,int b,boolean c){
		return a+b;	//���ؽ������������
	}
	
}