package movie;

public class AirConditioner {
	double targeTemp; 				// 27.0
	double nowTemp; 				// 22.0
	String heatingAndCooling; 		// heating, cooling
	String airconditionerCondition; // on, off, broken
	String airconditionerConditionBrand; 

	public AirConditioner() { 		// default value
		targeTemp = 27.0;
		nowTemp = 20.0;
		heatingAndCooling = "Cooling";
		airconditionerCondition = "on";
		airconditionerConditionBrand = "Samsung";
	}

	public AirConditioner(double targetTemp, double nowTemp, String heatAndCooling, String airconditionerCondition, String airconditionerConditionBrand) {
		this.targeTemp = targetTemp;
		this.nowTemp = nowTemp;
		this.heatingAndCooling = heatAndCooling;
		this.airconditionerCondition = airconditionerCondition;
		this.airconditionerConditionBrand = airconditionerConditionBrand;
	}
	
	public void printAirconDetails() {
		System.out.println("목표온도: " + targeTemp 
				+ "\n현재 온도: " + nowTemp 
				+ "\n에어컨, 히터 작동 종류: " + heatingAndCooling 
				+ "\n작동 여부: " + airconditionerCondition
				+ "\n에어컨 브랜드: " + airconditionerConditionBrand);
		System.out.println();
	}
}
