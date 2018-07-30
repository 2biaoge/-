import java.util.Scanner;

public class LianXi2{
	public static void main (String[]args){
		String a ="闰年";
		String b ="平年";
		
		int nian;
	
do{
	
	Scanner input = new Scanner(System.in);
		System.out.println("请输入要查询的年份：");

		nian =input.nextInt();	//初始化变量：nian

	
			int c=0;
		if ((c==nian%4&&c!=nian%100)||(c==nian%400)){

			System.out.println(a);}
		else{  System.out.println(b);}
}while(nian!=0000);
	System.out.println("输入0000结束运行");
	

		
	}
}


