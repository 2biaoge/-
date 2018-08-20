package com.qf.task2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// 需要打电话
		Phone phone = new NormalPhone("诺基亚", "1120");
		phone.call();
		// 需要拍照的
		Photoable photoable = new SmartPhone();
		photoable.photo();
		// 需要看电影
		
		PlayVideoable playVideoable = new SmartPhone();

		playVideoable.playVideo();
		Scanner input=new Scanner(System.in);
		

	}
}
