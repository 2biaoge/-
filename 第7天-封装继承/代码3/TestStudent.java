/*
����
*/
public class TestStudent{
	public static void main(String[] args){	
		Person laozhang=new Person();
		laozhang.name="����";
		laozhang.age=50;
		laozhang.bornDate="1960-10-1";
		Object r=laozhang.getInfo();
		System.out.println(r);

		Student xiaozhang=new Student();
		xiaozhang.name="СС��";
		xiaozhang.age=22;
		xiaozhang.bornDate="2000-1-1";
		xiaozhang.school="�廪��ѧ";
		String r1=xiaozhang.getInfo();
		System.out.println(r1);
		xiaozhang.study();
		
	}
}