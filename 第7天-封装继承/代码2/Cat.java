/*
猫
*/
public class Cat{
	String nickname;
	String color;
	//静态代码块
	static{
		System.out.println("静态代码块执行了************");	
	
	}

	//动态代码块
	{
		System.out.println("动态代码块执行了.....");
	}

	public Cat(){
		System.out.println("无参构造执行了...");	
	}

	public void show(){
		System.out.println("昵称:"+nickname+"，颜色："+color);
	}
	
}