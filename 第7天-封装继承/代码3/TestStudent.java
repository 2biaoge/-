/*
测试
*/
public class TestStudent{
	public static void main(String[] args){	
		Person laozhang=new Person();
		laozhang.name="老张";
		laozhang.age=50;
		laozhang.bornDate="1960-10-1";
		Object r=laozhang.getInfo();
		System.out.println(r);

		Student xiaozhang=new Student();
		xiaozhang.name="小小张";
		xiaozhang.age=22;
		xiaozhang.bornDate="2000-1-1";
		xiaozhang.school="清华大学";
		String r1=xiaozhang.getInfo();
		System.out.println(r1);
		xiaozhang.study();
		
	}
}