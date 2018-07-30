/*
使用do...while实现 打印三次hello world
*/
public class Demo6{
	public static void main(String[] args){
		//1初始化变量
		int i=0;
		do{
			//2循环体
			System.out.println("hello world");
			//3循环变量变化
			i++;
		}while(i<3);
	}
}