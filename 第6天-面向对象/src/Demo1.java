public class Demo1{
	public static void main(String[]agrs){
		Dog dog=new Dog();
		dog.nickname="旺财";
		Dog dog2=new Dog("二哈");

		dog.dogName();
		System.out.println("那只狗叫"+dog2.nickname);

		Person person=new Person();
		person.name="小美";
		person.where="在公园";

		Person person2=new Person();
		person2.name="小梅";
		person2.where="在广场";
		person.xingWei();
		System.out.println(person2.name+person2.where+"溜"+dog2.nickname);

	}
}