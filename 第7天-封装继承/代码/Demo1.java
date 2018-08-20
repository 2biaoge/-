/*
基本数据类型传递
*/
public class Demo1{
	public static void main(String[] args){
		int n=10;
		System.out.println("修改之前:"+n);
		change(n);
		System.out.println("修改之后:"+n);
		
	}
	//方法
	public static void change(int x){
		x=20;
		System.out.println(x+"------------");
	}
}