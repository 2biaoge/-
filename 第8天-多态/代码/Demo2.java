public class Demo2{
	public static void main(String[] args){
		String s1="hello";
		String s2=new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2)); //字符串用equals，equals比较的是内容。
	}
}