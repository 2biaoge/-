/*
使用二重循环打印矩形
******
******
******
******

*/
public class Demo15{
	public static void main(String[] args){
		for(int i=0;i<4;i++){ //4行
			for(int j=0;j<5;j++){ //5列
				System.out.print("*");	 
			}
			System.out.println();	
		}
	}
}