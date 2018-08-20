package com.qf.day12_6;
/*
 * 外套
 */
public class Coat extends Clothes {

	@Override
	public void design() {
		System.out.println("开始设计外套...");

	}

	@Override
	public void produce() {
		System.out.println("开始制作外套...");

	}
	@Override
	public void show() {
		System.out.println("这是一件外套");
	}

	public void print2(){
		System.out.println("yyyyyy");
	}
}
