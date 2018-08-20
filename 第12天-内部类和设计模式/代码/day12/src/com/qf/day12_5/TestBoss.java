package com.qf.day12_5;

import java.awt.Label;

public class TestBoss {
	public static void main(String[] args) {
		Boss laoban=Boss.getBoss();
		Boss laoban2=Boss.getBoss();
		Boss laoban3=Boss.getBoss();
		System.out.println(laoban.hashCode());
		System.out.println(laoban2.hashCode());
		System.out.println(laoban3.hashCode());
	}
}
