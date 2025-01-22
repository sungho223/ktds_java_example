package movie2;

public class DownTown {
	public static void main(String[] args) {

		Speaker harman = new Speaker();
		harman.volume = 50;
		harman.isOn = true;

		Light light = new Light();
		light.color = "red";
		light.isOn = true;

		Seat seat = new Seat();
		seat.seatNumber = "H1";

		Projector projector = new Projector();
		AirConditioner airConditioner = new AirConditioner();
		airConditioner.currentTemperature = 24.5F;

		Movie 하얼빈 = new Movie();
		하얼빈.title = "하얼빈";
		하얼빈.runningTime = 120;

		Theater cgv = new Theater();
		cgv.movie = 하얼빈;
		cgv.airConditioner = airConditioner;
		cgv.light = light;
		cgv.projector = projector;
		cgv.seat = seat;
		cgv.speaker = harman;
		
		cgv.playMovie();
		cgv.playMovie();

		cgv.turnOnAirConditioner();
		cgv.turnOnAirConditioner();

		cgv.changeLightStatus();
		cgv.changeLightStatus();
		
		cgv.changeVolume(50);
		cgv.changeVolume(70);
		cgv.changeVolume(-50);
		cgv.changeVolume(-10);
		
		cgv.seatStatus();
		cgv.seatStatus();
	}
}
