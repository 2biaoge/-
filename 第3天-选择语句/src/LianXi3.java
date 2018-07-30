import java.util.Scanner;
public class LianXi3{
	public static void main(String[]args){
		Scanner input =new Scanner(System.in);
		System.out.println("请输入季节：（春天/夏天/秋天/冬天)");
		
		

		String i = input.next();
 		switch(i){
   			case "春天":
   				System.out.println("11111111");
   				break;
   			case "夏天":
   				System.out.println("222222222");
   			case "秋天":
   				System.out.println("333333333");
				break;
			case "冬天":
   				System.out.println("444444444444");
   				break;
   				
   			default:
   				System.out.println("Hhhhhhh");
   				break;
			}
	}	
}