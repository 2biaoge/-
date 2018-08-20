package day13task;

import java.util.Scanner;

/*
 * 3. 从控制台录入一个字符串，判断字符'a'在该字符串中出现的次数
 *    从控制台录入一个字符串，判断字符串"wo"在该字符串中出现的次数
 */
public class task2 {
	public static void main(String[] args) {
		System.out.println("请输入一个字符串");
		Scanner input=new Scanner(System.in);
		String con=input.nextLine();
		int count=0;
//		for(int i=0;i<con.length();i++){
//			if(con.charAt(i)=='a'){
//				count++;
//			}
//		}
		
		int index=con.indexOf("wo");
		while(index>=0){
			count++;
			index=con.indexOf("wo",index+1);
		}
		
		System.out.println(count);
	}
}
