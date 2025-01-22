package movie;

public class Seat {
	String seatCondition; 	// clean, broken, dirty
	String seatReservation; // 예약 불가, 예약 가능
	String seatNumber; 		// A11, D02, Z18
	boolean seatFold;		// 좌석 접이 상태

	public Seat() {
		seatCondition = "clean";
		seatReservation = "possible to reserve";
		seatNumber = "A01";
		seatFold = true;
	}

	public Seat(String seatCondition, String seatReservation, String seatNumber, boolean seatFold) {
		this.seatCondition = seatCondition;
		this.seatReservation = seatReservation;
		this.seatNumber = seatNumber;
		this.seatFold = seatFold;
	}
	
	public void printSeatDetails() {
		System.out.println("좌석 상태: " + seatCondition
				+ "\n좌석 접이 상태: " + seatFold
				+ "\n예약 가능 여부: " + seatReservation 
				+ "\n좌석 번호: " + seatNumber);
		System.out.println();
	}
}
