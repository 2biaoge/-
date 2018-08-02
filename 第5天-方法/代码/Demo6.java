/*
定义一个无参，没有返回值的方法
*/
public class Demo6{
	public static void main(String[] args){	
		//调用
		show();
	}
	public static void show(){
		System.out.println("hello world");

		int x=10;
		if(x>5){
			return;// 结束方法
		}	
		System.out.println("最后的hello world");		
	}
}