/*
编程实现已知某人的工资(要求输入)，求他应该缴纳的个人所得税以及最后得到的工资。
	个人所得税计算方法计算方法 :
	全月应纳税所得额 =工资薪金所得-3500 
	应纳税额 = 应纳税所得额 *税率-速算扣除数 
*/
import java.util.Scanner;
public class Demo1{
	public static void main(String[] args){
		//1创建input对象
		Scanner input=new Scanner(System.in);
		//2提示
		System.out.println("请输入您的税前工资");
		double salary=input.nextDouble();
		double taxSalary=salary-3500;
		double tax;//税

		//3使用多重if判断
		if(taxSalary>100000){
			tax=taxSalary*0.45-15375;
			
		}else if(taxSalary>80000){
			tax=taxSalary*0.4-10375;
			
		}else if(taxSalary>60000){
			tax=taxSalary*0.35-6375;
			
		}else if(taxSalary>40000){
			tax=taxSalary*0.3-3375;
			
		}else if(taxSalary>20000){
			tax=taxSalary*0.25-1375;
			
		}else if(taxSalary>5000){
			tax=taxSalary*0.2-375;
			
		}else if(taxSalary>2000){
			tax=taxSalary*0.15-125;
			
		}else if(taxSalary>500){
			tax=taxSalary*0.1-25;
			
		}else{
			tax=taxSalary*0.05;
			
		}
		

		System.out.println("您的税后工资:"+(salary-tax));
		
	}
}