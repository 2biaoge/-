package com.qf.day12_6;
/*
 * 裤子
 */
public class Pants extends Clothes {

	@Override
	public void design() {
		System.out.println("开始设计裤子.....");
	}

	@Override
	public void produce() {
		System.out.println("开始生产裤子....");
	}

	@Override
	public void show() {
		System.out.println("这是一条裤子");
	}
	
	public void print1(){
		System.out.println("xxxxxxx");
	}

}
