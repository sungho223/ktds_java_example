package com.ktdsuniversity.edu.fp.stream.file.csv;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReadCSV {

	private final String CSV_PATH = "C:\\Users\\User\\Documents\\java-stream-countries-states-cities-database\\csv";

	public <R> List<R> loadData(FileName filename, Function<String[], R> function, Predicate<R> condition) {

		try {
			return Files.lines( new File(this.CSV_PATH, filename.filename).toPath() )
					    .skip(1)
					    .map(line -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))"))
					    .map(array -> function.apply(array))
//					    .filter(inst -> condition.test(inst))
					    .filter(inst -> condition != null ? condition.test(inst) : true)
					    .toList()
					    ;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
	public void printAllRegions() {
		this.loadData(FileName.REGIONS, array -> new Regions(array), null)
			.forEach(region -> {
							System.out.println("Region ID    : " +  region.getId());
							System.out.println("Region Name  : " + region.getName())
							;
			});
	}
	
	public void printAllSubRegions() {
		this.loadData(FileName.SUBREGIONS, array -> new Subregions(array),null)
			.stream()
			.sorted((sb1, sb2) -> sb1.getId() - sb2.getId())
			.toList()
			.forEach( region -> {
				// 오름차순으로 정렬 필요
							System.out.println("SubRegion ID     : "  + region.getId());
							System.out.println("SubRegion Name   : " + region.getName());
			});
		
	}
	
	public void printAllCountries() {
		this.loadData(FileName.COUNTRIES, array -> new Countries(array), null)
			.forEach(region -> {
							System.out.println("Country ID       : "  + region.getId());
							System.out.println("Country Name     : " + region.getName());
							System.out.println("Country Capital  : "  + region.getCapital());
			});
	}
	
	public void printAllStates() {
		this.loadData(FileName.STATES, array -> new States(array), null)
			.forEach( region -> {
						System.out.println("Region ID   : " +  region.getId());
						System.out.println("Country     : "+ region.getCountry_name());
						System.out.println("Region Name :"  + region.getName());
			});
	}
	
	public void printAllCities() {
		this.loadData(FileName.CITIES, array -> new City(array), null)
			.forEach( region -> {
							System.out.println("City ID            : "  + region.getId());
							System.out.println("Country Name       : "  + region.getCountryName());
							System.out.println("City Name          : "  + region.getName());
			});	
	}
	
	public void printAllCitieisOfSouthKorea() {
		// 국가명이 south korea 인 도시만 출력
		this.loadData(FileName.CITIES, array -> new City(array), region -> region.getCountryCode().equals("\"KR\""))
		.forEach( region -> {
						System.out.println("City ID      : "  + region.getId());
						System.out.println("City Name    : "  + region.getName());
		});	
	}

	public static void main(String[] args) {
		ReadCSV csv = new ReadCSV();
//		csv.printAllRegions();
		csv.printAllSubRegions();
//		csv.printAllCountries();
//		csv.printAllStates();
//		csv.printAllCities();
//		csv.printAllCitieisOfSouthKorea();
		
		
		
		
//		List<City> cities = csv.loadData(FileName.CITIES,array->new City(array));
//		cities.forEach(System.out::println);
		
//		List<Countries> countries = csv.loadData(FileName.COUNTRIES,array -> new Countries(array));
//		countries.forEach(System.out::println);
		
//		List<Regions> regions = csv.loadData(FileName.REGIONS, array -> new Regions(array), region -> region.getName().equals("Asia"));
//		regions.forEach(System.out::println);
		
//		List<States> states = csv.loadData(FileName.STATES, array -> new States(array));
//		states.forEach(System.out::println);
		
//		List<Subregions> subregions = csv.loadData(FileName.SUBREGIONS, array -> new Subregions(array));
//		subregions.stream()
//        		  .filter(subregion -> subregion.getName().equals("Caribbean"))
//        		  .forEach(System.out::println); 
		
		
		

	}

}
