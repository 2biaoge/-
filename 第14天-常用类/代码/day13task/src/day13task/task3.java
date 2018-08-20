package day13task;

import java.util.Scanner;

/*
 * 4. 完成猜拳游戏
   请输入你的选择:
   1)石头
   2)剪刀
   3)布
   你的选择是【布】, 电脑的选择是【石头】
   恭喜你获得了胜利！
 */
public class task3 {
	public static void main(String[] args) {
		System.out.println("开始猜拳游戏");
		Scanner input=new Scanner(System.in);
		String answer=null;
		do{
			System.out.println("请出招  1 石头  2 剪刀  3 步");
			int choice=input.nextInt();
			int sys=(int)(Math.random()*3)+1;
			System.out.println("电脑:"+sys);
			check(choice, sys);
			System.out.println("还继续玩吗?y/n");
			answer=input.next();
			
		}while(answer.equals("y"));
		
		System.out.println("欢迎下次再战...");
	}
	public static void check(int choice,int sys){
//		if(choice-sys==2){
//			System.out.println("你赢了...");
//		}else if(choice-sys==-2){
//			System.out.println("你输了...");
//		}else if(choice>sys){
//			
//		}
		if(choice==sys){
			System.out.println("平局");
			return;
		}
		
		switch (choice) {
		case 1:
			if(sys==2){
				System.out.println("你赢了");
			}else{
				System.out.println("你输了");
			}
			break;
		case 2:
			if(sys==1){
				System.out.println("你输了");
			}else{
				System.out.println("你赢了");
			}
			break;
		case 3:
			if(sys==1){
				System.out.println("你赢了");
			}else if(sys==2){
				System.out.println("你输了");
			}
			break;

		default:
			break;
		}
	}
}
