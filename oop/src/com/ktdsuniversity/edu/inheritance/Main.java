package com.ktdsuniversity.edu.inheritance;

public class Main {

	public static void main(String[] args) {
		Contact contact = new Contact("james", "010-3333-9999");
		
		Contact otherContact = new Contact("james", "010-3333-9999");
		System.out.println(contact == otherContact);
		System.out.println(contact.equals(otherContact));
		
		System.out.println(contact);
		System.out.println(otherContact);
		
		
		Contact contact1 = new Contact("hong", "010-1111-2222");
		Contact contact2 = new Contact("choi", "010-3333-4444");

		contact1.printContant();
		System.out.println();
		contact2.printContant();
		System.out.println();
		
		EmailContact emailContact1 = new EmailContact("kim", "010-5555-6666", "kim@test.com");
		Contact emailContact2 = new EmailContact("lee", "010-7777-8888", "lee@test.com");
		Contact emailContact3 = new EmailContact("lee", "010-7777-8888", "lee@test.com");
		
		System.out.println(emailContact2 == emailContact3);
		System.out.println(emailContact2.equals(emailContact3));
		System.out.println(emailContact3);
		System.out.println();
		
		
		emailContact1.printContant();
		System.out.println();
		emailContact2.printContant();
	}

}
