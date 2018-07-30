/*
上机练习1：买彩票

如果体彩中了500万，我买车、买房、非洲旅游

如果没中，继续买。

*/
import java.util.Scanner;
public class Demo4{
	public static void main(String[] args){
		//1创建input对象
		Scanner input=new Scanner(System.in);
		//2提示
		System.out.println("中500万吗?Y/N");
		String answer=input.next();
		//3判断
		if(answer.equals("y")){  //字符串的判断使用equals方法 
			System.out.println("买房、买车、欧洲旅游...");	
		}else{
			System.out.println("继续买....");
		}  	
	}
}

