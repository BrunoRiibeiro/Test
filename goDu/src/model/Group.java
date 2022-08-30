package model;

import java.util.ArrayList;
import java.util.List;

public class Group {

	private String name;
	private User creator;
	private String motivation;
	private String expectedDate;
	private List<User> members = new ArrayList<>();
	private List<Transportation> TRANSPORTATION = new ArrayList<>();
	private int numberOfMembers;
	private List<Restaurant> RESTAURANT = new ArrayList<>();
	private List<Accomodation> ACCOMODATION = new ArrayList<>();
	private double totalPrice;

	public Group(String name, User creator, String motivation, String expectedDate, List<User> members,
			List<Transportation> tRANSPORTATION, int numberOfMembers, List<Restaurant> rESTAURANT,
			List<Accomodation> aCCOMODATION, double totalPrice) {
		super();
		this.name = name;
		this.creator = creator;
		this.motivation = motivation;
		this.expectedDate = expectedDate;
		this.members = members;
		TRANSPORTATION = tRANSPORTATION;
		this.numberOfMembers = numberOfMembers;
		RESTAURANT = rESTAURANT;
		ACCOMODATION = aCCOMODATION;
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

	public List<User> getMembers() {
		return members;
	}

	public void setMembers(List<User> members) {
		this.members = members;
	}

	public int getNumberOfMembers() {
		return numberOfMembers;
	}

	public void setNumberOfMembers(int numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}

	public List<Restaurant> getRESTAURANT() {
		return RESTAURANT;
	}

	public List<Accomodation> getACCOMODATION() {
		return ACCOMODATION;
	}

	public List<Transportation> getTRANSPORTATION() {
		return TRANSPORTATION;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void deleteGroup(Group group) {

	}

	public void editGroup() {

	}

	public void addTravel() {

	}

	public void addRestaurant() {

	}

	public void addMembers(User member) {
		members.add(member);
		numberOfMembers++;
	}

	public void removeMembers(User member) {
		members.remove(members.indexOf(member));
		numberOfMembers--;
	}

	public String payPerPerson() {
		double eachPrice = totalPrice / numberOfMembers;
		return "Preço por participante: " + eachPrice;
	}

	@Override
	public String toString() {
		return "Group [name=" + name + ", creator=" + creator + ", motivation=" + motivation + ", expectedDate="
				+ expectedDate + ", members=" + members + ", numberOfMembers=" + numberOfMembers + ", travelList="
				+ RESTAURANT + ", accomodationList=" + ACCOMODATION + ", transportationList=" + TRANSPORTATION
				+ ", totalPrice=" + totalPrice + "]";
	}

}
