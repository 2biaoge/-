/*
人类
  属性:  java中使用成员变量表示 (属性)
  姓名
  年龄
  性别
  身高
  体重
  动作: java中使用方法来表示 
   吃
   玩
   睡
   跑	
   说
*/
public class Person{
	String name;//姓名
	int age; //年龄
	String gender;//性别
	double height;//身高
	double weight;//体重
	static String country; //静态的成员变量

	//吃
	public void eat(){
		System.out.println(name+"吃猪肉...");	
	}
	//说
	public void speak(){
		System.out.println(name+"说，爱你一万年.....");
	}
	public static void hi(){
		System.out.println("国家是:"+country);
	}

	
}