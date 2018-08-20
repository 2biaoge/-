package com.qf.day16_6;

public class Dog implements Comparable<Dog>{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog [color=" + color + "]";
	}

	@Override
	public int compareTo(Dog o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 
}	
	
