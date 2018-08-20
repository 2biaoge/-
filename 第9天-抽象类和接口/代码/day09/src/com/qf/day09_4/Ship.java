package com.qf.day09_4;

public class Ship extends Transport{
	@Override
	public void yun(String goods) {
		System.out.println("航运:"+goods);
	}
}
