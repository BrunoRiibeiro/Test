package model;

public class Accomodation {

	private String accomodation;
	private double accomodationCost;

	public Accomodation(String accomodation, double accomodationCost) {
		super();
		this.accomodation = accomodation;
		this.accomodationCost = accomodationCost;
	}

	public String getAccomodation() {
		return accomodation;
	}

	public void setAccomodation(String accomodation) {
		this.accomodation = accomodation;
	}

	public double getAccomodationCost() {
		return accomodationCost;
	}

	public void setAccomodationCost(double accomodationCost) {
		this.accomodationCost = accomodationCost;
	}

	@Override
	public String toString() {
		return "Accomodation [accomodation=" + accomodation + ", accomodationCost=" + accomodationCost + "]";
	}

}
