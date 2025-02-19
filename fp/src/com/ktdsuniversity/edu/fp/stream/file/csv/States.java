package com.ktdsuniversity.edu.fp.stream.file.csv;

public class States {

	private int id;	
	private String name;
	private int country_id;
	private String country_code;
	private String country_name;
	private String state_code;
	private String type;
	private double latitude;
	private double longitude;
	
	public States(String[] countryData) {
		this(
	            Integer.parseInt(countryData[0]),
	            countryData[1],
	            Integer.parseInt(countryData[2]),
	            countryData[3],
	            countryData[4],
	            countryData[5],
	            countryData[6],
	            countryData.length > 7 ? Double.parseDouble(countryData[7]):0,
	            countryData.length > 8 ? Double.parseDouble(countryData[8]):0	            
	      );
	}

	public States(int id, String name, int country_id, String country_code, String country_name, String state_code,
			String type, double latitude, double longitude) {
		this.id = id;
		this.name = name;
		this.country_id = country_id;
		this.country_code = country_code;
		this.country_name = country_name;
		this.state_code = state_code;
		this.type = type;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	

	@Override
	public String toString() {
		return "States [id=" + id + ", name=" + name + ", country_id=" + country_id + ", country_code=" + country_code
				+ ", country_name=" + country_name + ", state_code=" + state_code + ", type=" + type + ", latitude="
				+ latitude + ", longitude=" + longitude + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCountry_id() {
		return country_id;
	}

	public String getCountry_code() {
		return country_code;
	}

	public String getCountry_name() {
		return country_name;
	}

	public String getState_code() {
		return state_code;
	}

	public String getType() {
		return type;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}
	
	
	
	
	
}
