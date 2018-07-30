/*
示例1：如果成绩大于90并且是男生就送个女朋友，成绩大于90并且是女生送个男朋友，否则...
*/

public class Demo6{
	public static void main(String[] args){
		char sex='男';
		int score=92;
		if(sex=='男'&&score>90){
			System.out.println("送个女朋友");
		}else if(sex=='女'&&score>90){
			System.out.println("送个男朋友");
		}else{
			System.out.println("自己买...");	
		}		
	}
}