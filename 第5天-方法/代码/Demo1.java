/*
 �޲η���������
*/
public class Demo1{
	public static void  main(String[] args){
		//����
		method1();		
		method2();
		//����
		int r=method3();
		System.out.println(r);
		
	}
	//����һ������,������method1,�޲Σ��޷���ֵ
	public static void  method1(){
		for(int i=0;i<10;i++){
			System.out.println("hello world");
		}
	}

	//����һ������
	public static void method2(){
		for(int i=0;i<5;i++){
			System.out.println("�ú�ѧϰ����������");
		}
	}

	//����һ������ ��������ֵ��������
	public static int method3(){
		int a=10;
		int b=20;
		int c=a+b;	
		return c; //return ����c
	}
	
}