/*
 for循环特殊写法:
  省略 表达式3 :循环变量变化
*/
public class Demo12{
	public static void main(String[] args){
		int sum=0;
		for(int i=0;i<100;){
			sum+=i;
			i++;
		}
		System.out.println("和是:"+sum);	
	}
}