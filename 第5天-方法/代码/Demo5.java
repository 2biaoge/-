/*
 ����һ��������ʵ���������Ľ���
*/

public class Demo5{
	public static void main(String[] args){
		swap(8,20);	
		
		int r=add(3,5);
		System.out.println(r);
	}
	public static void swap(int a,int b){
		System.out.println("����֮ǰ:"+a+","+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("����֮��:"+a+","+b);
	}
	public static int add(int x,int y){
		int z=x+y;
		return z; //���ؽ������������
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