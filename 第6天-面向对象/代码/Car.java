/*
汽车类
*/
public class Car{
	//1属性
	String brand;
	String color;
		
	public Car(){
	}
	public Car(String b,String c){
		brand=b;
		color=c;	
	}
	public void run(){
		System.out.println("一辆"+brand+"牌，"+color+"颜色的汽车在飞速奔跑...");
	}
}