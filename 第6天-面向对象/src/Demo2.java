//创建对象。。。。。。。。。。。。调用属性

public class Demo2{
	public static void main(String[]args){
		Person person =new Person();
		person.name="小明";
		person.age=18;
		person.xingwei="跑步";
		Park park= new Park();
		park.name="在奥林匹克公园";
		
		Shoes shoes = new Shoes();
		shoes.name ="李宁运动鞋";
		shoes.size=41;
		shoes.color="黑色";
		
		System.out.println(person.age+"的"+person.name+"穿着"+shoes.size+"码的"+shoes.color+shoes.name+park.name+person.xingwei);

	}
}