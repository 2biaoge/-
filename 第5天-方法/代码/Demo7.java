public class Demo7{
	public static void main(String[] args){
		//����
		int r=add(10,20);
		System.out.println(r);

		add2(50,60);
	}
	//��������������ֵ
	public static int add(int a,int b){
		int sum=a+b;
		return sum;//���ؽ������������
	}
	//���������޷���ֵ
	public static void add2(int a,int b){
		int sum=a+b;
		System.out.println(sum);	
	}
}