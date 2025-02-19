package com.ktdsuniversity.edu.fp.stream.file.csv;

public class Regions {

	private int id;
	private String name;
	private String wikiDataId;

	
    public Regions(String[] countryData) {
    	this(
    			Integer.parseInt(countryData[0]),
    			countryData[1],
    			countryData[2]
    	);
    }
	
	@Override
	public String toString() {
		return "Regions [id=" + id + ", name=" + name + ", wikiDataId=" + wikiDataId + "]";
	}



	public Regions(int id, String name, String wikiDataId) {
		this.id = id;
		this.name = name;
		this.wikiDataId = wikiDataId;
	}



	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public String getWikiDataId() {
		return wikiDataId;
	}
	
	
	
	
}
