public class TestStudent{
	public static void main(String[]args){
		Student a =new Student();

		a.name="ɵ��";
		a.age=23;
		a.born="2030-1-1";
		a.school="�廪��ѧ";
		

		String b=a.getInfo();
		System.out.println(b);
		a.study();
	}
}