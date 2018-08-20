package com.qf.day12_6;

public class T_shirt extends Clothes {

	@Override
	public void design() {
		System.out.println("开始设计T恤...");

	}

	@Override
	public void produce() {
		// TODO Auto-generated method stub
		System.out.println("开始制作T恤...");
	}
	@Override
	public void show() {
		System.out.println("这是一件T恤");
	}
	public void print3(){
		System.out.println("zzzzzzz");
	}
}
