public class Demo5{
	public static void main(String[]args){
		Person p1=new Person();
		p1.name="����";
		p1.where="�ڼ���";
		p1.xingwei="��party,���ܼ��еĹ��ǣ�";
		System.out.print(p1.name+p1.where+p1.xingwei);
		Dog d1=new Dog();
		d1.gongneng="����������·";
		d1.jieshaodog();
		Dog d2=new Dog();
		d2.zhu();

		Person p2=new Person("����","������");
		Person p3=new Person("����");
		System.out.println(p2.name+"��"+p3.name+"�����Լ��İ�ɫ����");
	}
}