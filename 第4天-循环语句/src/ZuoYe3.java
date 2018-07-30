public class ZuoYe3{
	public static void main(String[]args){
		int sum=0;
		for(int i=100;i<=999;i++){
			int ge=i%10;
			int shi =i%100/10;
			int bai =i/100;
			sum=ge*ge*ge+shi*shi*shi+bai*bai*bai;
			if (i==sum){
				System.out.println(i);
			}
		}
	}
}