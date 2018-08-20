/*
PassValue类
*/
public class PassValue{
	//有一个基本类型的参数
	public void change(int x){	
		System.out.println("修改之前:"+x);
		x=200;
		System.out.println("修改之后:"+x);
	}
}