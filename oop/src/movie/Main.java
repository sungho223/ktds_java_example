package movie;

public class Main {
	
	public static void main(String[] args) {
		
		Movie movie = new Movie("극한직업", "이병헌", 111, "코미디");
		movie.printMovieDetails();
		
		Theater theater = new Theater("롯데시네마", "왕십리", "상영중");
		theater.printTheaterDetails();

		Seat seat = new Seat("청결", "예약가능", "X10", true);
		seat.printSeatDetails();

		AirConditioner airConditioner = new AirConditioner();
		airConditioner.printAirconDetails();

		Projector projector = new Projector();
		projector.projectorCondition = "on";
		projector.projectorBrand = "cannon";
		projector.printProjector();
		
		Light light = new Light();
		light.printLightDetails();
		
		Speaker speaker = new Speaker();
		speaker.speakerCondition = "고장";
		speaker.printSpeakerDetails();
	}
}
