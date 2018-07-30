import java.util.Scanner;
public class Text{
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		String e = input.next();
		if (e.equals("是")){
			System.out.println("全部存进银行产生利息。");
		}else if (e.equals("否")){
			System.out.println("存多少？");
			int f =input.nextInt();
	
			if(f>10){
				System.out.println("输入的金额>中奖金额：");
			}else if(f>=0){
				System.out.println("");
				System.out.println("");
				System.out.println("万元");
			}else{
				System.out.println("输入金额不个合法。");
			}
							
		}else{
			System.out.println("输入有误！");
		}
	}
}