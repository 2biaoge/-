/*
嵌套if
示例：如果成绩大于90   如果是男生 送个女朋友，   如果是女生送个男朋友
*/
public class Demo8{
	public static void main(String[] args){
		int score=100;
		char sex='男';
		if(score>90){
			if(sex=='男'){
				System.out.println("送个女朋友");
			}else{
				System.out.println("送个男朋友");
			}
		}
	}
}