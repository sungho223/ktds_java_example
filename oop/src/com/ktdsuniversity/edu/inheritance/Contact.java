package com.ktdsuniversity.edu.inheritance;

public class Contact {

	private String name;
	private String phone;

	public Contact(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public void printContant() {
		System.out.println("이름: " + this.name + ", 연락처: " + this.phone);
	}

}
