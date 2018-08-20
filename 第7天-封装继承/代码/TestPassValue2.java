/*
测试PassValue2
*/
public class TestPassValue2{
	public static void main(String[] args){
		//1创建对象
		PassValue2 p=new PassValue2();
		p.x=5;
		System.out.println(p.x);
		p.change(p);
		System.out.println(p.x);
	}
}