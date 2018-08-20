/*
测试类
*/
public class TestSon{
	public static void main(String[] args){
		Father f=new Father();
		f.name="老张";
		f.age=50;
		f.work();
		
		Son s=new Son();
		s.name="小张";
		s.age=18;
		s.hobby="魔兽游戏";
		s.play();
		s.work();
		
	}
}