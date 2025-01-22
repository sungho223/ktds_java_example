package movie;

/**
 * 영화 정보: -> 영화제목, 러닝타임
 */
public class Movie {

	String title; 		// 극한직업, 청년경찰
	String supervision; // 이병헌, 김주환
	int runningTime; 	// 111분, 109분
	String filmField; 	// 코미디, 액션

	public Movie(String title, String supervision, int runningTime, String filmField) {
		this.title = title;
		this.supervision = supervision;
		this.runningTime = runningTime;
		this.filmField = filmField;
	}
	
	public void printMovieDetails() {
		System.out.println("영화제목: " + title 
				+ "\n감독: " + supervision 
				+ "\n러닝타임: " + runningTime 
				+ "\n분야: " + filmField);
		System.out.println();
	}

}
