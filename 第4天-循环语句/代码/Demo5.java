/*
求1-100的偶数的和
*/
public class Demo5{
	public static void main(String[] args){
		/*
		int z=2;
		int sum=0;
		while(z<=100){
			sum=sum+z;
			z+=2;
		}
		System.out.println("1-100的偶数的和是:"+sum);
		*/
		int z=1;
		int sum=0;
		while(z<=100){
			if(z%2==0){
				sum=sum+z;
			}
			z++;
		}

		
	}
}