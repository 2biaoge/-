/*
2.求1-3+5-7+ …… -99+101的值
*/

public class ZuoYe2{
	public static void main(String[]args){
		int sum =0;
		int count =0;
		
		for(int a=1;a<=101;a+=2){
			count++;
			if(count%2!=0){
				sum=sum+a;
			}else {
				sum =sum-a;
			}
		}
		System.out.println("1-3+5-7+ …… -99+101的值="+sum);
	}
}