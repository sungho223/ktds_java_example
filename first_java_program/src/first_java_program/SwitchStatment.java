package first_java_program;

public class SwitchStatment {

	public static void main(String[] args) {

		// 회원가입을 받을 때, 사용자가 등록할 수 없는 아이디, 목록 -> black list
		// 관리자가 사용하는 아이디가 별도로 존재 -> admin, root, superuser 등등
		// 운영자가 사용하는 아이디가 별도로 존재 -> master, operator, system, syspor 등등

		String memberId = "user";

		String memberGradeA = switch (memberId) {
		case "admin", "root", "superuser", "administrator" -> "운영자";
		case "master", "operator", "system", "syspor" -> "관리자";
		default -> "일반 사용자";
		};

		System.out.println(memberGradeA);
		System.out.println();

		// 또는 아래와 같이 사용

		String memberGrade = switch (memberId) {
		case "admin":
		case "root":
		case "superuser":
		case "administrator":
			yield "관리자";
			
		case "master":
		case "operator":
		case "system":
		case "syspor":
			yield "운영자";
			
		default:
			yield "일반사용자";
		};
		System.out.println(memberId + "는(은) " + memberGrade + " 입니다.");
		System.out.println();

	}

}
