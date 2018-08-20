/*
Demo2
*/
public class Demo2{
	
	String str="hello world";//成员变量 
	static int num=100; //静态成员变量
	
	public static void main(String[] args){
		//System.out.println(str);//在静态方法中不能访问非静态的成员变量
		System.out.println(num);//在静态方法中能访问静态成员变量
		//调用
		show();
		//hi(); //在静态方法不能访问非静态的方法
		int num=200; //局部变量 ,如果成员变量和局部变量名字相同，局部变量优先级高
		System.out.println(num);
		
	}
	//静态的方法
	public static void show(){ 
		System.out.println(num);
	}
	//非静态的方法
	public void hi(){
		System.out.println("打招呼"+str);
		show(); // 在非静态方法中能访问静态的方法
	}
}