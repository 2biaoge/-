/*
测试Dog类
*/
public class TestDog{
	public static void main(String[] args){
		//1创建dog对象 new Dog(); 开辟空间，调用构造方法创建对象
		Dog wangcai=new Dog();
		//2属性赋值
		wangcai.nickname="旺财";
		wangcai.strain="哈士奇";
		wangcai.color="灰白色";
		wangcai.age=3;
		//3调用方法
		wangcai.play();
		wangcai.show();
		wangcai.workHome();

		//4创建对象
		Dog laifu=new Dog("来福","拉布拉多");
		laifu.age=5;
		laifu.color="白色";
		//5调用方法
		laifu.play();
		laifu.show();
		laifu.workHome();
		
	}

}