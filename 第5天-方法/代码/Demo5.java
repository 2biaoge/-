/*
 定义一个方法，实现两个数的交换
*/

public class Demo5{
	public static void main(String[] args){
		swap(8,20);	
		
		int r=add(3,5);
		System.out.println(r);
	}
	public static void swap(int a,int b){
		System.out.println("交换之前:"+a+","+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("交换之后:"+a+","+b);
	}
	public static int add(int x,int y){
		int z=x+y;
		return z; //返回结果，结束方法
	}

	public static int ope(int x,int y,char o){	
		int z=0;
		if(o=='+'){
			z=x+y;
		
		}else if(o=='-'){
			z=x-y;
			
		}else{
		    z=0;	
		}	

		return z;
	}
}