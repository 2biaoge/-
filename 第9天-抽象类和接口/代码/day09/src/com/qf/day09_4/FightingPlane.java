package com.qf.day09_4;
/*
 * 战斗机
 */
public class FightingPlane extends Plane implements Fireable{

	@Override
	public void fire() {
		System.out.println("向敌人轰炸....");
	}
	
}
