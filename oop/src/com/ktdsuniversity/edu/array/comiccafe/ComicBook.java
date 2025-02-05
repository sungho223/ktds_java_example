package com.ktdsuniversity.edu.array.comiccafe;

public class ComicBook {

	private String name;
	private boolean isRental;

	public ComicBook(String name, boolean isRental) {
		this.name = name;
		this.isRental = isRental;
	}

	public String getName() {
		return this.name;
	}

	public boolean getIsRental() {
		return this.isRental;
	}

	public void setIsRental(boolean isRental) {
		this.isRental = isRental;
	}
}
