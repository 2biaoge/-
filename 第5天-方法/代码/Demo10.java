/*
 重载
*/
public class Demo10{
	public static void main(String[] args){
	
	}
	public static void print(){
		System.out.println("没有参数");
	}
	public static void print(int x){
		System.out.println("有一个整型参数:"+x);
	}
	public static void print(long l){
		System.out.println("有一个长整型参数:"+l);
	}
	public static void print(int y){
		System.out.println("有一个整型参数:"+y);	
	}
	public static void print(String s){
		System.out.println("有一个字符串参数:"+s);
	}
	public static String print(String name){
		System.out.println("有一个字符串参数:"+name);
		return "hello";
	}
}