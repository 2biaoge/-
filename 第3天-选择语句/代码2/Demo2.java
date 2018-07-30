/*
使用switch 判断 春夏秋冬
*/
import java.util.Scanner; //导入Scanner类
public class Demo2{
	public static void main(String[] args){
		//1创建input对象
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个季节");
		String season=input.next();	
		switch(season){	
			case "春天":
				System.out.println("春游");
				break;
			case "夏天":
				System.out.println("游泳");
				break;
			case "秋天":
				System.out.println("分手");
				break;
			case "冬天":
				System.out.println("冬眠");
				break;
			default:
				System.out.println("输入错误...");
				break;
		}
	}
}