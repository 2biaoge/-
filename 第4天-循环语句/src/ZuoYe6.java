public class ZuoYe6{
	public static void main(String[]args){
		System.out.println("N"+"\t"+"10*N"+"\t"+"100*N"+"\t"+"1000*N");
		for(int n=1;n<=5;n++){
			System.out.println(n);
			sum=n;
			for(j=1;j<4;j++){
				
				System.out.print(sum+"\t");
				sum=j*10;
			}
		}
	}
}