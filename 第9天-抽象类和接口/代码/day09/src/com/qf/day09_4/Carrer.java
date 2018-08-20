package com.qf.day09_4;

public class Carrer extends Ship implements Fireable{

	@Override
	public void fire() {
		System.out.println("向敌人发射核弹头....");
	}

}
