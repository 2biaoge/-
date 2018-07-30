/*
三目运算符:
?：	
*/
public class Demo10{
	public static void main(String[] args){
		int score=90;
		String s=score>90?"很优秀":"优秀";
		String s2=score>90?"优秀":score>80?"良好":"一般";
		System.out.println(s);
		System.out.println(s2);
		
	}
}