package movie;

public class Light {
	String lightColor; 		// yellow, red, blue
	String lightCondition; // on, off, broken
	String lightBrand;

	public Light() { 		// default value
		lightColor = "red";
		lightCondition = "on";
		lightBrand = "sony";
	}

	public Light(String lightColor, String lightCondition ,String lightBrand) {
		this.lightColor = lightColor;
		this.lightCondition = lightCondition;
		this.lightBrand = lightBrand;
	}

	public void printLightDetails() {
		System.out.println("조명 색깔: " + lightColor 
				+ "\n조명 상태: " + lightCondition
				+ "\n조명 브랜드: " + lightBrand);
		System.out.println();
	}
}
