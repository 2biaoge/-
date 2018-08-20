public class Demo5{
	public static void main(String[]args){
		Person p1=new Person();
		p1.name="李晓";
		p1.where="在家里";
		p1.xingwei="开party,介绍家中的狗是：";
		System.out.print(p1.name+p1.where+p1.xingwei);
		Dog d1=new Dog();
		d1.gongneng="会两条腿走路";
		d1.jieshaodog();
		Dog d2=new Dog();
		d2.zhu();

		Person p2=new Person("张三","付二代");
		Person p3=new Person("李四");
		System.out.println(p2.name+"向"+p3.name+"介绍自几的白色宾利");
	}
}