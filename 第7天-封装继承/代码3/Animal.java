/*
动物类
*/
public class Animal{
	String nickname;
	String color;
	String strain;

	public Animal(){
		System.out.println("Animal的无参构造执行了....");	
	}
	public Animal(String nickname,String color){
		this.nickname=nickname;
		this.color=color;
		System.out.println("Animal带参的构造方法");
	}
	
	public void print(){
		System.out.println("昵称:"+nickname+" 颜色:"+color+" 品种:"+strain);
	}
}