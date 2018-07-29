/*
++ 自增
-- 自减
*/

public class Demo2{
	public static void main(String[] args){
		int num=10;
		//num++;// num增加1
		//++num; //num增加1

		//int num2=num++; // num的值赋值给num2,然后num增加1
		int num2=++num; //num先增加1 ，然后num赋值给num2
		System.out.println(num2);

	
		int n=5;
		//int n2=n--; //n先赋值给n2,然后n减1
		int n2=--n;
		System.out.println(n2);
		System.out.println(n);
		
	}
}
