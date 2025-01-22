package movie;

public class Projector {
	String projectorCondition; 	// on, off, broken
	String projectorBrand; 		// sony, cannon
	boolean isOn;

	public Projector() {
		projectorCondition = "off";
		projectorBrand = "sony";
	}
	

	public Projector(String projectorCondition, String projectorBrand, boolean isOn) {
		this.projectorCondition = projectorCondition;
		this.projectorBrand = projectorBrand;
		this.isOn = isOn;
	}
	
	public void printProjector() {
		System.out.println("영사기 작동여부: " + projectorCondition 
				+ "\n영사기 브랜드: " + projectorBrand
				+ "\n영사지 현재 사용 여부: " + isOn);
		
		
		System.out.println();
	}
}
