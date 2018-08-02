public class Demo7{
	public static void main(String[] args){
		//调用
		int r=add(10,20);
		System.out.println(r);

		add2(50,60);
	}
	//带参数，带返回值
	public static int add(int a,int b){
		int sum=a+b;
		return sum;//返回结果，结束方法
	}
	//带参数，无返回值
	public static void add2(int a,int b){
		int sum=a+b;
		System.out.println(sum);	
	}
}