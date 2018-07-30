/*
打印1到10个数，遇到4的倍数程序自动退出
*/
public class Demo6{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			if(i%4==0){
				break;
			}
			System.out.println(i);
		}
	}	
}