/*
QFStudent
	学号，姓名，年龄，地址

	显示信息方法
*/

public class QFStudent{
	String stuNo;//学号
	String name;//姓名
	int age;//年龄
	String address;//地址

	//显示信息
	public void show(){
		System.out.println("姓名:"+this.name+",学号:"+this.stuNo+",年龄:"+age+",地址:"+address);
	}
		
}