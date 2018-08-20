/*
Person类
*/
public class Person{
	String name; //姓名
	int age; //年龄
	String bornDate; //出生日期

	//获取信息
	public Object getInfo(){
		return "姓名:"+name+",年龄:"+age+",出生日期:"+bornDate;
	}
}