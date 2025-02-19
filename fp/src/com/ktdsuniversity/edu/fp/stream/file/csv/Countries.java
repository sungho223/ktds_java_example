package com.ktdsuniversity.edu.fp.stream.file.csv;

public class Countries {
	

    private int id;
    private String name;
    private String iso3;
    private String iso2;
    private int numericCode;
    private String phoneCode;
    private String capital;
    private String currency;
    private String currencyName;
    private String currencySymbol;
    private String tld;
    private String nativeName;
    private String region;
    private int regionId;
    private String subregion;
    private int subregionId;
    private String nationality;
    private String timezones;
    private double latitude;
    private double longitude;
    private String emoji;
    private String emojiU;

    public Countries(String[] countryData) {
    	this(
    	        Integer.parseInt(countryData[0]),            
    	        countryData[1],                              
    	        countryData[2],                             
    	        countryData[3],                              
    	        Integer.parseInt(countryData[4]),            
    	        countryData[5],                              
    	        countryData[6],                               
    	        countryData[7],                             
    	        countryData[8],                               
    	        countryData[9],                               
    	        countryData[10],                            
    	        countryData[11],                              
    	        countryData[12],                          
    	        Integer.parseInt(countryData[13]),            
    	        countryData[14],                             
    	        Integer.parseInt(countryData[15]),           
    	        countryData[16],                              
    	        countryData[17],                              
    	        countryData.length > 18 ? Double.parseDouble(countryData[18]) : 0,  
    	        countryData.length > 19 ? Double.parseDouble(countryData[19]) : 0,  
    	    	countryData[20],                              
    	    	countryData[21]
//    	        countryData.length > 20 ? countryData[20] : "",  
//    	        countryData.length > 21 ? countryData[21] : ""  
    	    );
    }


    


	@Override
	public String toString() {
		return "Countries [id=" + id + ", name=" + name + ", iso3=" + iso3 + ", iso2=" + iso2 + ", numericCode="
				+ numericCode + ", phoneCode=" + phoneCode + ", capital=" + capital + ", currency=" + currency
				+ ", currencyName=" + currencyName + ", currencySymbol=" + currencySymbol + ", tld=" + tld
				+ ", nativeName=" + nativeName + ", region=" + region + ", regionId=" + regionId + ", subregion="
				+ subregion + ", subregionId=" + subregionId + ", nationality=" + nationality + ", timezones="
				+ timezones + ", latitude=" + latitude + ", longitude=" + longitude + ", emoji=" + emoji + ", emojiU="
				+ emojiU + "]";
	}





	public Countries(int id, String name, String iso3, String iso2, int numericCode, String phoneCode, String capital,
			String currency, String currencyName, String currencySymbol, String tld, String nativeName, String region,
			int regionId, String subregion, int subregionId, String nationality, String timezones, double latitude,
			double longitude, String emoji, String emojiU) {
		this.id = id;
		this.name = name;
		this.iso3 = iso3;
		this.iso2 = iso2;
		this.numericCode = numericCode;
		this.phoneCode = phoneCode;
		this.capital = capital;
		this.currency = currency;
		this.currencyName = currencyName;
		this.currencySymbol = currencySymbol;
		this.tld = tld;
		this.nativeName = nativeName;
		this.region = region;
		this.regionId = regionId;
		this.subregion = subregion;
		this.subregionId = subregionId;
		this.nationality = nationality;
		this.timezones = timezones;
		this.latitude = latitude;
		this.longitude = longitude;
		this.emoji = emoji;
		this.emojiU = emojiU;
	}




	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getIso3() {
		return iso3;
	}

	public String getIso2() {
		return iso2;
	}

	public int getNumericCode() {
		return numericCode;
	}

	public String getPhoneCode() {
		return phoneCode;
	}

	public String getCapital() {
		return capital;
	}

	public String getCurrency() {
		return currency;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public String getCurrencySymbol() {
		return currencySymbol;
	}

	public String getTld() {
		return tld;
	}

	public String getNativeName() {
		return nativeName;
	}

	public String getRegion() {
		return region;
	}

	public int getRegionId() {
		return regionId;
	}

	public String getSubregion() {
		return subregion;
	}

	public int getSubregionId() {
		return subregionId;
	}

	public String getNationality() {
		return nationality;
	}

	public String getTimezones() {
		return timezones;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public String getEmoji() {
		return emoji;
	}

	public String getEmojiU() {
		return emojiU;
	}

  

}