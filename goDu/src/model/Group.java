package model;

import java.util.ArrayList;
import java.util.List;

public class Group {

	private String name;
	private User creator;
	private String motivation;
	private String expectedDate;
	private List<Transportation> transportation = new ArrayList<>();
	private int numberOfMembers;
	private List<Restaurant> restaurant = new ArrayList<>();
	private List<Accommodation> accommodation = new ArrayList<>();
	private double totalPrice;

	public Group(String name, User creator, String motivation, String expectedDate, List<Transportation> transportation, 
			int numberOfMembers, List<Restaurant> restaurant, List<Accommodation> accommodation, double totalPrice) {
		super();
		this.name = name;
		this.creator = creator;
		this.motivation = motivation;
		this.expectedDate = expectedDate;
		this.transportation = transportation;
		this.numberOfMembers = numberOfMembers;
		this.restaurant = restaurant;
		this.accommodation = accommodation;
		this.totalPrice = totalPrice;
	}

	public Group(String name, User creator, String expectedDate, String motivation) {
		super();
		this.name = name;
		this.creator = creator;
		this.expectedDate = expectedDate;
		this.motivation = motivation;
		this.totalPrice = 0;
	}

	public String getNameGroup() {
		return name;
	}

	public void setNameGroup(String name) {
		this.name = name;
	}

	public String getMotivation() {
		return motivation;
	}

	public void setMotivation(String category) {
		this.motivation = category;
	}

	public String getExpectedDate() {
		return expectedDate;
	}

	public void setExpectedDate(String expectedDate) {
		this.expectedDate = expectedDate;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public int getNumberOfMembers() {
		return numberOfMembers;
	}

	public void setNumberOfMembers(int numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}

	public List<Restaurant> getRestaurant() {
		return restaurant;
	}

	public List<Accommodation> getAccommodation() {
		return accommodation;
	}

	public List<Transportation> getTransportation() {
		return transportation;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String payPerPerson() {
		double eachPrice = totalPrice / numberOfMembers;
		return "Preço por participante: " + eachPrice;
	}

	@Override
	public String toString() {
		return "Group [name=" + name + ", creator=" + creator + ", motivation=" + motivation + ", expectedDate="
				+ expectedDate + ", numberOfMembers=" + numberOfMembers + ", travelList="
				+ restaurant + ", accommodationList=" + accommodation + ", transportationList=" + transportation
				+ ", totalPrice=" + totalPrice + "]";
	}

}
