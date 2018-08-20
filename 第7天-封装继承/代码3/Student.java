/*
Student

重写规则：
1 方法名必须和父类的相同
2 参数列表必须和父类相同
3 返回值必须和父类相同(在1.7 返回值类型和父类兼容)
4 访问权限不能比父类严格
*/
public class Student extends Person{
	
	String school;//学校

	
	public void study(){
		System.out.println(name+"好好学习，天天向上");
	}

	public String getInfo(){
		return "姓名:"+name+",年龄:"+age+",出生日期:"+bornDate+" 学校:"+school;
	}
	
	
}