public class Cat{
	private String nickname;
	private int age;
	private String color;

	static{
		System.out.println("静态代码快.......。。。");
	}
	
	{
		System.out.println("动态代码快=构造代码块被执行\n请描述。。。");
	}

	
	public String getNickname(){
		return nickname;
	}
	public void setNickname(String nickname){
		this.nickname=nickname;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age =age;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}

	public Cat(){
	System.out.println("无参构造方法被执行。。。。。。。。。");
	}
	public void show(String nickname,int age,String color){
		this.nickname=nickname;// /////////////////////////////////////////////////////////
		this.age=age;
		this.color=color;
			System.out.println("这只"+color+"的猫叫"+nickname+"今年"+age+"岁");
	}
	public Cat(String nickname,int age,String color){
		this.nickname=nickname;
		this.age=age;
		this.color=color;
			System.out.println("这只"+color+"的猫叫"+nickname+"今年"+age+"岁了。lelele\n"+"带参构造方法被执行。。调用");
	}	
	
}