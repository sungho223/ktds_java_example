package movie;

public class Movie {

	// 멤버변수.
	String title;
	
	// 멤버변수
	int runningTime;
	
	public void printMovieInformation() {
		System.out.println("Movie title: " + this.title);
		System.out.println("Movie running time: " + this.runningTime);
	}
	
}