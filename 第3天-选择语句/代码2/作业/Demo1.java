/*
���ʵ����֪ĳ�˵Ĺ���(Ҫ������)������Ӧ�ý��ɵĸ�������˰�Լ����õ��Ĺ��ʡ�
	��������˰���㷽�����㷽�� :
	ȫ��Ӧ��˰���ö� =����н������-3500 
	Ӧ��˰�� = Ӧ��˰���ö� *˰��-����۳��� 
*/
import java.util.Scanner;
public class Demo1{
	public static void main(String[] args){
		//1����input����
		Scanner input=new Scanner(System.in);
		//2��ʾ
		System.out.println("����������˰ǰ����");
		double salary=input.nextDouble();
		double taxSalary=salary-3500;
		double tax;//˰

		//3ʹ�ö���if�ж�
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
		

		System.out.println("����˰����:"+(salary-tax));
		
	}
}