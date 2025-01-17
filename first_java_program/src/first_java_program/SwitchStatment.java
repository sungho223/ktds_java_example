package first_java_program;

public class SwitchStatment {

	public static void main(String[] args) {
		String memberId = "admin";
		int memberGrade = switch (memberId) {
		case "admin":
		case "root":
			yield 1;
		case "sysopr":
			yield 2;
		default:
			yield 3;
		};
		System.out.println(memberId);	//admin
		System.out.println(memberGrade);//1
	}
}
