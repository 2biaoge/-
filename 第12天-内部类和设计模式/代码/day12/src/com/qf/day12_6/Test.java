package com.qf.day12_6;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("请选择您要的衣服1 裤子 2外套 3T-shirt");
		Scanner input=new Scanner(System.in);
		String choice=input.next();
		Clothes clothes=ClothesFactory.make(choice);
		
		clothes.show();
		check(clothes);
	}
	public static void check(Clothes clothes){
		if(clothes instanceof Pants){
			Pants pants=(Pants)clothes;
			pants.print1();
		}else if(clothes instanceof Coat){
			Coat coat=(Coat)clothes;
			coat.print2();
		}else if(clothes instanceof T_shirt){
			T_shirt t_shirt=(T_shirt)clothes;
			t_shirt.print3();
		}
	}
}
