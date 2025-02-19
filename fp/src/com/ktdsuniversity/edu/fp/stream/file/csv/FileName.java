package com.ktdsuniversity.edu.fp.stream.file.csv;

public enum FileName {

	CITIES("cities.csv"),
	COUNTRIES("countries.csv"),
	REGIONS("regions.csv"),
	STATES("states.csv"),
	SUBREGIONS("subregions.csv");
	
	public String filename;
	
	FileName(String filename) {
		this.filename = filename;
	}

}
