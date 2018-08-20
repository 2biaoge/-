package com.qf.day09_1;

public class Car extends TrafficTool{
	@Override
	public void run() {
		System.out.println(getBrand()+"驾驶着前进......");
	}
}
