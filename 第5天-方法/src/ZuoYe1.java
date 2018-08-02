
/*
1.计算从1到某个数以内所有奇数的和。
*/
public class ZuoYe1{
	public static void main(String[]args){
	
	int i=sum(7);
		System.out.println(i);
	}
	public static int sum(int x){
		int sum=0;
		for(int i=1;i<=x;i+=2){
			 sum=sum+i;
		
		}
			return sum;
	}
}
//100  2500