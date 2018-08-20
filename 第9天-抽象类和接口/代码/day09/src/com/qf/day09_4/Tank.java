package com.qf.day09_4;

public class Tank extends Car implements Fireable{

	@Override
	public void fire() {
		System.out.println("向敌人开炮.....");
		
	}

}	
