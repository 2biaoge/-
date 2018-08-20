public class TestStudent{
	static int num=200000;
	public static void main(String[] args){
		//调用静态方法
		Student.calcTotalCount();
		//调用静态属性
		System.out.println(Student.totalCount);
		System.out.println(num); //访问本类的静态变量
	}
}