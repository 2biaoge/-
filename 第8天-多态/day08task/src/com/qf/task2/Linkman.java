package com.qf.task2;
/*
 * 联系人
 * 	联系人的姓名，性别，年龄，手机号，身份证号
 */
public class Linkman {
	private String name;
	private String gender;
	private int age;
	private String phone;
	private String identify;
	
	public Linkman() {
		// TODO Auto-generated constructor stub
	}

	public Linkman(String name, String gender, int age, String phone, String identify) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.identify = identify;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIdentify() {
		return identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}

	@Override
	public String toString() {
		return "Linkman [name=" + name + ", gender=" + gender + ", age=" + age + ", phone=" + phone + ", identify="
				+ identify + "]";
	}
	
	
}
