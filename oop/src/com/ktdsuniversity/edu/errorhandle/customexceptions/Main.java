package com.ktdsuniversity.edu.errorhandle.customexceptions;

public class Main {

	// 회원가입을 하는 메소드
	public static void registNewMember(String id, String password) {
		if ( id == null || id.isEmpty() ) {
//			System.out.println("아이디는 필수 입력값입니다. 올바르게 입력해주세요.");
			throw new InvalidUserIdException("아이디는 필수 입력값입니다. 올바르게 입력해주세요.");
		}
		else if ( id.equals("admin") ) {
//			System.out.println("admin 은 사용할 수 없습니다. 다른 아이디를 사용해주세요.");
			throw new InvalidUserIdException("admin 은 사용할 수 없습니다. 다른 아이디를 사용해주세요.");
		}
//		else {
//			System.out.printf("아이디: %s, 비밀번호: %s 가입이 완료되었습니다.\n", id, password);
//		}
	}
	
	public static void main(String[] args) {
		try {
			registNewMember(null, "sdaflkjfalsd");
		}
		catch (InvalidUserIdException iuie) {
			System.out.println("실패 사유: " + iuie.getMessage());
		}
		
		try {
			registNewMember("", "sdaflkjfalsd");
		}
		catch(InvalidUserIdException iuie) {
			System.out.println("실패 사유: " + iuie.getMessage());
		}
		
		try {
			registNewMember("admin", "sdaflkjfalsd");
		}
		catch (InvalidUserIdException iuie) {
			System.out.println("실패 사유: " + iuie.getMessage());
		}
		
		try {
			registNewMember("sfsafsd", "sdaflkjfalsd");
		}
		catch (InvalidUserIdException iuie) {
			System.out.println("실패 사유: " + iuie.getMessage());
		}
		
		
//		InvalidUserIdException iuie = 
//				new InvalidUserIdException
//					("사용할 수 없는 아이디 입니다. 다른 아이디를 사용해 주세요.");
		
		// 일반 클래스와 다른 점 : RuntimeException 을 상속했다.
//		System.out.println(iuie.getMessage());
		
		// throw new NumberFormatException("For input string: sdfsdfsfsaf")
		// Integer.parseInt("sdaflkjdsaf");
		
		// RuntimeException 을 상속했을 때 할 수 있는 것?
		// iuie 예외를 던져서 애플리케이션을 강제로 죽일 수 있다.
//		throw iuie;
//		throw new InvalidUserIdException(" 메시지 메시지 메시지 ");
		
	}
	
}