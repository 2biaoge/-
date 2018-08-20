/*
 使用Person类
  
  类型分为两大类：
		基本类型 和引用类型
		基本类型
		引用类型： 类  数组  接口 枚举
*/
public class Demo1{
	public static void main(String[] args){
		//1使用Person类创建一个对象
		Person liangliang=new Person();
		Person meimei=new Person();
		//2给liangliang赋值属性
		liangliang.name="亮亮";
		meimei.name="美美";
		//3调用liangliang的方法
		liangliang.eat();
		liangliang.speak();
		meimei.eat();
		meimei.speak();
		
		//如果要访问另外一个类中的静态成员变量和静态方法 类名.静态成员变量  类名.静态方法名
		//Person.country="中国";	
		//Person.hi();
		

	}
}