package com.qf.day09;

public  class Dog extends Animal{
	private String strain;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	@Override
	public void print() {
		System.out.println("id:"+this.getId()+" name:"+this.getName()+" health:"+getHealth()+" love:"+this.getLove()+" strain:"+this.strain);
	}
	
}
