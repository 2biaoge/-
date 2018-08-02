/*
定义两个相同名字的方法
如果一个类中有
1 多个方法名字相同
2 参数列表不同  
	个数不一样
	类型不同

 和返回值、修饰符没关系
*/
public class Demo9{
	public static void main(String[] args){
		//调用
		//show();
		show(20.5);
		
	}
	public static void show(){
		System.out.println("hello world");	
	}
	public static void show(int x){
		System.out.println("世界您好"+x);	
	}
	public static void show(double d){
		System.out.println("宇宙你好:"+d);	
	}

	public static void show(int x,double d){
	
	}
	public static void show(double d,int x){
	
	}
}