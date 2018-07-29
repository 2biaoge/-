/*
强制类型转换
*/
public class Demo12{
	public static void main(String[] args){
		long l=100L;
		int n=(int)l;//强制转换

		int n2=10001;
		byte b=(byte)n2;
		System.out.println(n);
		System.out.println(b);
	}
}