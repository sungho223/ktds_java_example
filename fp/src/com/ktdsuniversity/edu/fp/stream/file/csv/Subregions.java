package com.ktdsuniversity.edu.fp.stream.file.csv;

public class Subregions {
	
	private int id;
	private String name;
	private int region_id;
	private String wikiDataId;

    public Subregions(String[] countryData) {
    	this(
    			Integer.parseInt(countryData[0]),
    			countryData[1],
    			Integer.parseInt(countryData[2]),
    			countryData[2]
    	);
    }
	
	public Subregions(int id, String name, int region_id, String wikiDataId) {
		this.id = id;
		this.name = name;
		this.region_id = region_id;
		this.wikiDataId = wikiDataId;
	}


	@Override
	public String toString() {
		return "Subregions [id=" + id + ", name=" + name + ", region_id=" + region_id + ", wikiDataId=" + wikiDataId
				+ "]";
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getRegion_id() {
		return region_id;
	}


	public String getWikiDataId() {
		return wikiDataId;
	}
	
	
	

}
