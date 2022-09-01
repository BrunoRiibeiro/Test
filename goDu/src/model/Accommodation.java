package model;

public class Accommodation extends Arrangement {

	private String accommodation;
	private double accommodationCost;

	public Accommodation(String date, String locale, String accommodation, double accommodationCost) {
		super(date, locale);
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
	public void toPostpone() {
		// TODO Auto-generated method stub

	}

	@Override
	public void antecipate() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean cancel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "Accommodation [accommodation=" + accommodation + ", accommodationCost=" + accommodationCost + ", date="
				+ date + ", locale=" + locale + "]";
	}

}
