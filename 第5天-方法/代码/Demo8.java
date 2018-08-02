/*
定义一个方法，比较两个数的大小，返回大的
*/
public class Demo8{
	public static void main(String[] args){
		//调用
		int r=compare(10,30);
		System.out.println(r);
	}
	public static int compare(int num1,int num2){
		if(num1>num2){
			return num1;
		}else{
			return num2;
		}	
	}
}