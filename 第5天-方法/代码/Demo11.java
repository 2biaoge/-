/*
递归演示
1 出现问题： StackOverFlow 栈空间溢出异常
*/
public class Demo11{
	public static void main(String[] args){
		show();	
	}
	public static void show(){
		System.out.println("hello");
		show();	
	}
}