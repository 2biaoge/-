public class Demo1{
	public static void main(String[]agrs){
		Dog dog=new Dog();
		dog.nickname="����";
		Dog dog2=new Dog("����");

		dog.dogName();
		System.out.println("��ֻ����"+dog2.nickname);

		Person person=new Person();
		person.name="С��";
		person.where="�ڹ�԰";

		Person person2=new Person();
		person2.name="С÷";
		person2.where="�ڹ㳡";
		person.xingWei();
		System.out.println(person2.name+person2.where+"��"+dog2.nickname);

	}
}