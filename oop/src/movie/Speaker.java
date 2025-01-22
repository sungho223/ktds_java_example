package movie;

public class Speaker {
	String speakerCondition;	// on, off, broken
	String speakerBrand; 		// sony

	public Speaker() {
		speakerCondition = "on";
		speakerBrand = "sony";
	}

	public Speaker(String speakerCondition) {
		this.speakerCondition = speakerCondition;
		speakerBrand = "sony";
	}
	
	public void printSpeakerDetails() {
		System.out.println("스피커 상태: " + speakerCondition 
				+ "\n스피커 브랜드: " + speakerBrand);
		System.out.println();
	}
}
