package model;

public class Accommodation {

	private String accommodation;
	private double accommodationCost;

	public Accommodation(String accommodation, double accommodationCost) {
		super();
		this.accommodation = accommodation;
		this.accommodationCost = accommodationCost;
	}

	public String getAccommodation() {
		return accommodation;
	}

	public void setAccommodation(String accommodation) {
		this.accommodation = accommodation;
	}

	public double getAccommodationCost() {
		return accommodationCost;
	}

	public void setAccommodationCost(double accommodationCost) {
		this.accommodationCost = accommodationCost;
	}

	@Override
	public String toString() {
		return "Accommodation [accommodation=" + accommodation + ", accommodationCost=" + accommodationCost + "]";
	}

}
