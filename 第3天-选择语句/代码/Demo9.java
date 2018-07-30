/*
上机练习1：输入四个季节：如果春天，输出“春暖花开”，
如果是夏天，输出“夏日炎炎”，
如果是秋天，则输出"秋高气爽",
如果是冬天，则输出"安静祥和"。
*/
import java.util.Scanner;
public class Demo9{
	public static void main(String[] args){
		//1创建input对象
		Scanner input=new Scanner(System.in);
		System.out.println("请输入季节");
		String season=input.next();
		if(season.equals("春天")){
			System.out.println("春暖花开");
		}else if(season.equals("夏天")){
			System.out.println("夏日炎炎");
		}else if(season.equals("秋天")){
			System.out.println("秋高");	
		}else if(season.equals("冬天")){
			System.out.println("冬眠");
		}

	}
}