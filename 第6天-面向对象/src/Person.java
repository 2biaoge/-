public class Person{
	String name;
	int age;
	String gender;
	String where;
	String xingwei;
	String shenfen;

	//无参构造方法自动生成，但一个类中如果存在有参构造方法，要创建无参构造方法。否则无参构造方法自动调用时会报错：实参列表和形参列表长度不同。
	public Person(){
	}

	
	public void xingWei(){		//无参普通方法：需要在对象中调用，必须有返回值类型。
	where="在公园";
	Dog dog =new Dog();		//在方法里创建对象。
	dog.nickname="旺财";
		System.out.println(name+where+"溜"+dog.nickname);
	}		//在本类方法中使用本类属性直接使用: name  
			//在本类方法中使用其他类属性需要声明属性所属对象名称：dog.nickname
	
	public void laoShi(){
		name="老王";
		System.out.println(name+"在认真的讲课");
	
	}
	public	void xueSheng(){
		name ="小明";
		System.out.println(name+"在认真的听课做笔记");
	}
	public void xiaoHong(String m,int n){	//带参普通方法：需对形参赋值初始，调用时传入实参
		name=m;
		age=n;
		System.out.println(name+"今年"+age+"岁");
	}
	public Person(String mm){			//带参构造方法。注意创建对象时其他对象的构造方法
		name=mm;
		System.out.println("这个人是"+name);
	}
	public void aYi(String a,String w,String x){
	name=a;
	where=w;
	xingwei=x;
	System.out.println(a+w+x);
	}
	public Person(String mm,String nn){
		name=mm;
		shenfen=nn;
		System.out.println("这个人是"+shenfen+name);
		
	}
	
}