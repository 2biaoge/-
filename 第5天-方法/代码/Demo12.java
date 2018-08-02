/*
求第30个斐波那契数
*/
public class Demo12{
	public static void main(String[] args){
		int r=feibo(30);
		System.out.println(r);
	}
	public static int feibo(int num){
		if(num==1||num==2){
			return 1;
		}
		return feibo(num-1)+feibo(num-2);
			
	}
}