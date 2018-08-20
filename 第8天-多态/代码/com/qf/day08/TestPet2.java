/*
 领养宠物
*/
package com.qf.day08;
import java.util.Scanner;
public class TestPet2{
	public static void main(String[] args){
		System.out.println("欢迎来到xxx宠物商店.....");
		System.out.println("请选择您要领养的宠物类型 1 狗狗  2 猫咪");
		Scanner input=new Scanner(System.in);
		int choice=input.nextInt();
		
		Master yuhuan=new Master();
		Pet p=yuhuan.adopt(choice);
		if(p!=null){
			System.out.println("领养成功");
			p.print();
			yuhuan.play(p);
			
		}else{
			System.out.println("领养失败");
		}
		
	}
}