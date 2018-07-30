/*
用do/while实现打印100以内的奇数
*/
public class Demo7{
	public static void main(String[] args){
		//1初始化变量
		int j=1;
		do{
			/*
			System.out.println(j);
			j+=2;
			*/
			if(j%2!=0){
				System.out.println(j);
			}
			j++;
		}while(j<=100);
	}
}