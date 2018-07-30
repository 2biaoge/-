/*如何不借助第三个变量，交换两个数据*/
public class Demo1{
	public static void main(String[] args){
		//借助第三个变量，交换两个数据
		/*int a =10;
		int b= 20;	
		System.out.println("交换之前:a:"+a+",b:"+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("交换之后:a:"+a+",b:"+b);
		*/
		
		/*不借助第三个变量实现交换  加减法 */
		/*int a=10;
		int b=20;
		System.out.println("交换之前:a:"+a+",b:"+b);

		a=a+b; //a=30
		b=a-b; //b=10
		a=a-b;// a=20
		System.out.println("交换之后:a:"+a+",b:"+b);*/
		/*不借助第三个变量实现交换  异或法*/

		int a=10;
		int b=20;
		System.out.println("交换之前:a:"+a+",b:"+b);

		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("交换之后:a:"+a+",b:"+b);
		
	}
}