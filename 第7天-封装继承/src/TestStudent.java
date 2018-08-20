public class TestStudent{
	public static void main(String[]args){
		Student a =new Student();

		a.name="傻根";
		a.age=23;
		a.born="2030-1-1";
		a.school="清华大学";
		

		String b=a.getInfo();
		System.out.println(b);
		a.study();
	}
}