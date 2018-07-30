/*
continue：在循环中的使用 
作用：跳过本次循环，继续下一次循环
要求：循环1-10，遇到4的倍数不打印
*/
public class Demo7{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			if(i%4==0){
				continue;
			}
			System.out.println(i);
		}
	}
}