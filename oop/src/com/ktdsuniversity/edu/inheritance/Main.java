package com.ktdsuniversity.edu.inheritance;

public class Main {

	public static void main(String[] args) {
		
		Contact contact = new EmailContact("장민창", "010-1234-1234", "gmail@gmail.com");
		Contact otherContact = new EmailContact("장민창", "010-1234-1234", "gmail@gmail.com");
		
		System.out.println( contact ); // 이름: 장민창, 연락처: 010-1234-1234
		System.out.println( otherContact ); // 이름: 장민창, 연락처: 010-1234-1234
		
		System.out.println( contact == otherContact ); // false
		System.out.println( contact.equals(otherContact) ); // true
		
		
		Contact contact1 = new Contact("홍길동", "010-1111-2222");
		Contact contact2 = new Contact("대길이", "010-3333-4444");
		contact1.printContact();
		contact2.printContact();
		
		EmailContact contact3 = new EmailContact("친구1", "010-2222-3333", "friends1@gmail.com");
		EmailContact contact4 = new EmailContact("친구2", "010-4444-5555", "friends2@gmail.com");
		
		// (다형성) Sub class is a Super class
		// 서브클래스 인스턴스를 슈퍼클래스 타입의 인스턴스에 할당 가능하다.
		Contact contact5 = new EmailContact("친구3", "010-5555-6666", "friends3@gmail.com");
		Contact contact6 = new EmailContact("친구4", "010-7777-8888", "friends4@gmail.com");
		
		contact3.printContact();
		contact4.printContact();
		contact5.printContact();
		contact6.printContact();
		
		System.out.println(contact1.getName());
		System.out.println(contact2.getName());
		System.out.println(contact3.getName());
		System.out.println(contact4.getName());
		System.out.println(contact5.getName());
		System.out.println(contact6.getName());
	}
	
}