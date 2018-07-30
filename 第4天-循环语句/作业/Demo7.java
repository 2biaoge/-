/*
7.打印2到10000的所有素数，每行显示8个素数

素数 ： 质数 ：只能被1和它自身整数的数，加质数  2  3  5   50
        和数   4  6  8  9 10
*/

public class Demo7{
	public static void main(String[] args){	
		for(int i=2;i<=100;i++){
			boolean isPrime=true;//假设所有的都是
			for(int k=2;k<i;k++){
				if(i%k==0){
					isPrime=false;
					break;	
				}
			}	
			if(isPrime){
				System.out.println(i+"是素数");
			}
		}
	}
}