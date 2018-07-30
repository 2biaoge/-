/*
 for循环特殊写法:
  1 省略 表达式2 :循环条件
*/
public class Demo11{
	public static void main(String[] args){
		int sum=0;
		for(int i=0;;i++){
			sum+=i;
			System.out.println(sum);
		}
		//System.out.println("和是:"+sum);	
	}
}