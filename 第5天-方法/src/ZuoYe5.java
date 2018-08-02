public class ZuoYe5{
	public static void main(String[]args){
		int ge=suShu(100);
		System.out.println(ge);
	}
	public static int suShu(int x){
		boolean isPrime=true;
		int count =0;
		for(int i=2;i<=x;i++){
			for(int n=i-1;n<i;n++)
			if(i%n==0){
				isPrime=false;
			}else{
				count++;
			}
		}
		return count;
	}
}