/*
1 输出100~200之间能被3整除的数

2 判断一个数字是否是素数
*/
public class Demo14{
	public static void main(String[] args){
		//调用
		method1();

		method2(53);
	}
	//输出100~200之间能被3整除的数
	public static void method1(){
		for(int i=100;i<=200;i++){
			if(i%3==0){
				System.out.println(i);
			}
		}
	}
	//判断一个数字是否是素数
	public static void method2(int num){
		boolean isPrime=true;//假如都是素数
		for(int i=2;i<num;i++){
			if(num%i==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime){
			System.out.println(num+"是素数");
		}else{
			System.out.println(num+"不是素数");
		}
		
	}

	
}