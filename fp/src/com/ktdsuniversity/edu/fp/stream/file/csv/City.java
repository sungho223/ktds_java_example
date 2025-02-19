package com.ktdsuniversity.edu.fp.stream.file.csv;

public class City {

	    private int id;
	    private String name;
	    private int stateId;
	    private String stateCode;
	    private String stateName;
	    private int countryId;
	    private String countryCode;
	    private String countryName;
	    private double latitude;
	    private double longitude;
	    private String wikiDataId;

	    public City(int id, String name, int stateId, String stateCode, String stateName, int countryId,
				String countryCode, String countryName, double latitude, double longitude, String wikiDataId) {
			this.id = id;
			this.name = name;
			this.stateId = stateId;
			this.stateCode = stateCode;
			this.stateName = stateName;
			this.countryId = countryId;
			this.countryCode = countryCode;
			this.countryName = countryName;
			this.latitude = latitude;
			this.longitude = longitude;
			this.wikiDataId = wikiDataId;
		}
	    
	    public City(String[] countryData) {	
	    	this(
	    			Integer.parseInt(countryData[0]),            
	    	        countryData[1],                              
	    			Integer.parseInt(countryData[2]),                           
	    	        countryData[3],                              
	    	        countryData[4],    
	    			Integer.parseInt(countryData[5]),
	    	        countryData[6],
	    	        countryData[7],
	    	        countryData.length > 8 ? Double.parseDouble(countryData[8]) : 0,  
	    	    	countryData.length > 9 ? Double.parseDouble(countryData[9]) : 0, 
	    	        countryData.length >10 ? countryData[10] : ""
	    	);
	    	
	    }
	    
	    

		@Override
		public String toString() {
			return "City [id=" + id + ", name=" + name + ", stateId=" + stateId + ", stateCode=" + stateCode
					+ ", stateName=" + stateName + ", countryId=" + countryId + ", countryCode=" + countryCode
					+ ", countryName=" + countryName + ", latitude=" + latitude + ", longitude=" + longitude
					+ ", wikiDataId=" + wikiDataId + "]";
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public int getStateId() {
			return stateId;
		}

		public String getStateCode() {
			return stateCode;
		}

		public String getStateName() {
			return stateName;
		}

		public int getCountryId() {
			return countryId;
		}

		public String getCountryCode() {
			return countryCode;
		}

		public String getCountryName() {
			return countryName;
		}

		public double getLatitude() {
			return latitude;
		}

		public double getLongitude() {
			return longitude;
		}

		public String getWikiDataId() {
			return wikiDataId;
		}
	    
	    
	    
}
