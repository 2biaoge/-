/*
学生类
// 属性
name
age
hobby

//动作
introduce();
dance();
sing();
lie();
*/
public class Student{
	String name;//姓名
	int age;//年龄
	String hobby;//爱好
		
	//自我介绍
	public void introduce(){
		System.out.println("大家好，我是"+name+",年龄:"+age+",爱好:"+hobby);	
	}
	//跳舞
	public void dance(){
		System.out.println(name+"来一段广场舞");	
	}
	//唱歌
	public void sing(){
		System.out.println(name+"来一段忐忑");
	}
	//吹牛皮
	public void lie(){
		System.out.println(name+"来一段段子...");
	}
	
}