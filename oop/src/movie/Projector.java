package movie;

public class Projector {
	String projectorCondition; 	// on, off, broken
	String projectorBrand; 		// sony, cannon

	public Projector() {
		projectorCondition = "off";
		projectorBrand = "sony";
	}

	public Projector(String projectorCondition, String projectorBrand) {
		this.projectorCondition = projectorCondition;
		this.projectorBrand = projectorBrand;
	}
	
	public void printProjector() {
		System.out.println("영사기 작동여부: " + projectorCondition 
				+ "\n영사기 브랜드: " + projectorBrand);
		System.out.println();
	}
}
