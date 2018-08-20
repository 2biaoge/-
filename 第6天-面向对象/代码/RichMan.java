/*
富二代
*/
public class RichMan{
	//姓名
	public String name;
	//是否有钱
	public boolean hasMoney;
	
	public RichMan(){
	}
	public RichMan(String n,boolean h){
		name=n;
		hasMoney=h;	
	}

	public void drive(){
		Car c=new Car();
		c.brand="宝马";
		c.color="红色";
		System.out.println(name+"开着"+c.brand+"牌汽车...");	
	}

	public void show(){
		Car c=new Car("宝马","红色");
		
		GirlFriend feng=new GirlFriend("凤姐");
		System.out.println(name+"向"+feng.name+"炫耀"+c.brand+"牌汽车");
		
	}

	
}