package com.qf.day09_4;
/*
 * 多态的体现
 */
public class Test {
	public static void main(String[] args) {
		Fireable fireable=new FightingPlane();
		Fireable fireable2=new Tank();
		Fireable fireable3=new Carrer();
		fight(fireable);
		fight(fireable2);
		fight(fireable3);
		
		
	}
	
	//战斗
	public static void fight(Fireable fireable){
		fireable.fire();
	}
}
