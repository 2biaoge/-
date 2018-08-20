/*
猫类继承动物
*/
public class Cat extends Animal{
	String hobby;

	public Cat(){
		super();
		System.out.println("猫类的无参构造执行了...");
	}
		
	public void play(){
		System.out.println(super.nickname+"玩"+this.hobby);
		super.print();
	}
}