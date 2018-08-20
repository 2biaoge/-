package com.qf.task2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//1创建一个电话本
		PhoneBook myPhoneBook=new PhoneBook();
		System.out.println("欢迎进入我的电话本...");
		int choice=0;
		do {
			System.out.println("请选择：1  新增  2 搜索  3显示所有 4 退出 ");
			Scanner input = new Scanner(System.in);
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("请输入联系人姓名");
				String name = input.next();
				System.out.println("请输入联系人性别");
				String gender = input.next();//获取字符串中的第一个字符
				System.out.println("请输入年龄");
				int age = input.nextInt();
				System.out.println("请输入电话");
				String phone = input.next();
				System.out.println("请输入身份证号");
				String identify = input.next();
				Linkman linkman = new Linkman(name, gender, age, phone, identify);
				myPhoneBook.add(linkman);
				break;
			case 2:
				System.out.println("请输入要查找的练习人的姓名");
				String s = input.next();
				Linkman[] linkmans = myPhoneBook.search(s);
				for (Linkman l : linkmans) {
					if (l != null) {
						System.out.println(l.toString());
					}
				}
				break;
			case 3:
				myPhoneBook.searchAll();
				break;
			case 4:
				System.out.println("欢迎下次再来....");
				break;
			default:
					System.out.println("您输入有误，请重新输入...");
				break;
			}
		} while (choice!=4);
		
		
	}
}
