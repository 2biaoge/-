package com.qf.day16_3;

public class Person extends Object{
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	

	@Override
	public int hashCode() {
		int namehashCode = name.hashCode();  
		int addhashCode = address.hashCode();
		return namehashCode+addhashCode;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		if(obj instanceof Person){
			Person p=(Person)obj;
			if(this.name.equals(p.name)&&this.address.equals(p.address)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	
	}
	
}
