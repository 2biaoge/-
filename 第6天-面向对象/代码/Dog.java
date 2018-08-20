/*
Dog
 属性：
   昵称
   品种
   颜色
   年龄
 动作:
    看家
    显示信息
    玩耍
*/
public class Dog{
	//昵称
	String nickname;
	//品种
	String strain;
	//颜色
	String color;
	//年龄
	int age;
	//无参构造方法
	public Dog(){
		//System.out.println("无参构造方法执行了....");
	}
	//带参构造方法
	public Dog(String _nickname,String _strain){
		nickname=_nickname;//把_nickname的值赋值给nickname
		strain=_strain;//把_strain的值赋值给strain;
	}

	
	//方法
	public void workHome(){
		System.out.println(nickname+"帮你看家");	
	}	
	public void show(){
		System.out.println("昵称:"+nickname+" 品种:"+strain+" 颜色:"+color+", 年龄："+age);
	}
	public void play(){
		System.out.println("主人和狗狗在玩耍.....");
	}
 
}