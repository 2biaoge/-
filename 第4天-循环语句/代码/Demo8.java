/*
100 以内能够被3整除  但是不能被5整除的数打印输出
*/
public class Demo8{
	public static void main(String[] args){
		//1初始化变量
		int z=0;
		do{
			if(z%3==0&&z%5!=0){
				System.out.println(z);
			}
			z++;
		}while(z<=100);
	}
}