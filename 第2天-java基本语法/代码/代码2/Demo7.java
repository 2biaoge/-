/*
短路与 和短路或
*/
public class Demo7{
	public static void main(String[] args){
		int z=5;
		int w=5;
		boolean b=z>5 && ++w>5; //短路|| 如果前面的条件为真 ，后面条件不执行
		System.out.println(z);
		System.out.println(w);
		System.out.println(b);

					
		
	}
}