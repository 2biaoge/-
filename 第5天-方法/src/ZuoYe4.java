import java.util.Scanner;
public class ZuoYe4{
	
	public static void main(String[]args){
		int g=ge();
		System.out.println(g);
	}
	//从键盘输入一个数n，判断是不是一个质数（质数是只能被1和它自身整除的数）。	

	public static int ge(){
		System.out.println("输入n个数判断质数的个数   n=:");
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int count=0;
		for(int a=1;a<=n;a++){
			boolean isPrime=true;//假设所有都是
				for(int k=2;k<a;k++){
					if(a%k==0){
						isPrime=false;
						break;
					}
				}
				if(isPrime){
					count+=1;
				}
		}
		return count;
	}
}