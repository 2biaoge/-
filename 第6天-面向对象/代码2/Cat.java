/*
猫类
*/
public class Cat{
	String name;//昵称
	int age;//年龄
	String color;//颜色

	//构造方法
	public Cat(){
		//this("无名",1);//调用带参构造方法
		System.out.println("无参构造执行了......");
	}
	public Cat(String name,int age){
		this();//调用无参构造方法
		this.name=name;	
		this.age=age;	
		
	}
	public Cat(String name,int age,String color){
		this();//调用无参构造方法
		this.name=name;
		this.age=age;
		this.color=color;	
	}

	//方法
	public void show1(){
		System.out.println("昵称:"+this.name);	
		this.show2();

	}

	public void show2(){
		System.out.println("年龄:"+this.age);
	}
}