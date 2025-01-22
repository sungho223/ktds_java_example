package movie;

public class Theater {
	String theaterName; 	// 롯데시네마, CGV
	String theaterArea; 	// 낙성대, 잠실, 성수, 왕십리
	String theaterCondition; // 휴일, 상영중

	public Theater() {}
	
	public Theater(String theaterName, String theaterArea, String theaterCondition) {
		this.theaterName = theaterName;
		this.theaterArea = theaterArea;
		this.theaterCondition = theaterCondition;
	}

	public void printTheaterDetails() {
		System.out.println("영화관: " + theaterName 
				+ "\n장소: " + theaterArea 
				+ "\n상영여부: " + theaterCondition);
		System.out.println();
	}
}
