/*
商品价格表
       (1)用户从控制台输入需要查询的商品编号，根据编号显示对应商品价格。
       (2)循环查询商品价格  （商品名称 单价）
       (3)输入n退出循环
*/
import java.util.Scanner;
public class Demo8{
	public static void main(String[] args){
		//1创建Input对象
		Scanner input=new Scanner(System.in);
		//2提示
		System.out.println("请输入要查询的商品编号");
		String no=input.next(); //1 2  3 4 5
		while(!no.equals("n")){
			switch(no){
				case "1":
					System.out.println("iphone8\t7800");
					break;	
				case "2":
					System.out.println("笔记本\t18000");
					break;
				case "3":
					System.out.println("冰箱\t3000");
					break;	
				case "4":
					System.out.println("电视机\t5000");
					break;	
				case "5":
					System.out.println("洗衣机\t2000");
					break;	
				default:
					System.out.println("输入有误");
					break;
			}
			System.out.println("请输入要查询的商品编号");
			no=input.next();
		}	
			
	}
}