/*
 for循环特殊写法:
  省略 表达式1和表达式3 :初始化变量 、循环变量变化
*/
public class Demo13{
	public static void main(String[] args){
		int sum=0;
		int i=0;
		for(;i<100;){
			sum+=i;
			i++;
		}
		System.out.println("和是:"+sum);	
	}
}