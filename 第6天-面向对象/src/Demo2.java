//�������󡣡�����������������������������

public class Demo2{
	public static void main(String[]args){
		Person person =new Person();
		person.name="С��";
		person.age=18;
		person.xingwei="�ܲ�";
		Park park= new Park();
		park.name="�ڰ���ƥ�˹�԰";
		
		Shoes shoes = new Shoes();
		shoes.name ="�����˶�Ь";
		shoes.size=41;
		shoes.color="��ɫ";
		
		System.out.println(person.age+"��"+person.name+"����"+shoes.size+"���"+shoes.color+shoes.name+park.name+person.xingwei);

	}
}