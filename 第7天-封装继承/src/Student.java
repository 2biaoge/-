public class Student extends Person{
	String school;

	public void study(){
		System.out.println(name+"在"+school+"学习java");
	}

	public String getInfo(){
		return "姓名："+name+"\t年龄："+age+"\t出生日期："+born+"来自"+school;
	}

}