/*
求1-3+5-7+ …… -99+101的值
*/
public class Demo2{
	public static void main(String[] args){
		int sum=0;
		int count=0;//计数
		for(int i=1;i<=101;i+=2){
			//System.out.println(i);
			count++;
			if(count%2!=0){
				sum=sum+i;
			}else{
				sum=sum-i;
			}
			
		}	
		System.out.println("sum:"+sum);
	}
}