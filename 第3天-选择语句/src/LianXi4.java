import java.util.Scanner;
public class LianXi4{
	public static void main(String[]args){
		Scanner input =new Scanner(System.in);
		System.out.println("输入税前工资：");
		double shuiqian =input.nextDouble();
		double nashui =shuiqian -3500;
		double shui;
		if (nashui>100000){
				shui =nashui*0.45-15375;
		}else if(nashui>=80000){
				shui =nashui*0.4-10375;
		}else if(nashui>=60000){
				shui =nashui*0.35-6375;
		}else if(nashui>=40000){
				shui =nashui*0.3-3375;
		}else {shui =shuiqian*0.5;

		}
			System.out.println(shuiqian-shui);
	}
}