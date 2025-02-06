package com.ktdsuniversity.edu.inheritance;

public class Main {

	public static void main(String[] args) {
		Contact contact1 = new Contact("hong", "010-1111-2222");
		Contact contact2 = new Contact("choi", "010-3333-4444");

		contact1.printContant();
		System.out.println();
		contact2.printContant();
		System.out.println();
		
		EmailContact emailContact1 = new EmailContact("kim", "010-5555-6666", "kim@test.com");
		Contact emailContact2 = new EmailContact("lee", "010-7777-8888", "lee@test.com");
		
		emailContact1.printContant();
		System.out.println();
		emailContact2.printContant();
	}

}
