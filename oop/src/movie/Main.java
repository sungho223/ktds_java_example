package movie;

public class Main {
	
	AirConditioner airConditioner = new AirConditioner();
	
	Light light = new Light();
	
	Movie movie = new Movie();
	
	Projector projector = new Projector();
	
	Seat seat = new Seat();
	
	Speaker speaker = new Speaker();
	
	Theater theater = new Theater();

	
	
	
	
	
	public static void main(String[] args) {
		
		Movie movie = new Movie("극한직업", "이병헌", 111, "코미디", "1관");
		movie.printMovieDetails();
		movie.setMovieTitle(movie);
		movie.printMovieDetails();
		
		Theater theater = new Theater("롯데시네마", "왕십리", "상영중");
		theater.printTheaterDetails();

		Seat seat = new Seat("청결", "예약가능", "20/40", true);
		seat.printSeatDetails();

		AirConditioner airConditioner = new AirConditioner();
		airConditioner.printAirconDetails();

		Projector projector = new Projector();
		projector.printProjector();
		projector.projectorCondition = "on";
		projector.projectorBrand = "cannon";
		projector.isOn = true;
		projector.printProjector();
		
		
		Light light = new Light();
		light.printLightDetails();
		
		Speaker speaker = new Speaker();
		speaker.speakerCondition = "고장";
		speaker.printSpeakerDetails();
	}
}
