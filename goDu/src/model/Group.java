package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {

	private String name;
	private String creator;
	private String motivation;
	private String expectedDate;
	private List<User> members = new ArrayList<>();
	private int numberOfMembers;
	private String[] travelList;
	private String[] accomodationList;
	private String[] transportationList;
	private double totalPrice;

	public Group(String name, String creator, String expectedDate, String motivation) {
		super();
		this.name = name;
		this.creator = creator;
		this.expectedDate = expectedDate;
		this.motivation = motivation;
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

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
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

	public String[] getTravelList() {
		return travelList;
	}

	public void setTravelList(String[] travelList) {
		this.travelList = travelList;
	}

	public String[] getAccomodationList() {
		return accomodationList;
	}

	public void setAccomodationList(String[] accomodationList) {
		this.accomodationList = accomodationList;
	}

	public String[] getTransportationList() {
		return transportationList;
	}

	public void setTransportationList(String[] transportationList) {
		this.transportationList = transportationList;
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

	public String payList() {
		return "oi!";
	}

	@Override
	public String toString() {
		return "Group [name=" + name + ", creator=" + creator + ", motivation=" + motivation + ", expectedDate="
				+ expectedDate + ", members=" + members + ", numberOfMembers=" + numberOfMembers + ", travelList="
				+ Arrays.toString(travelList) + ", accomodationList=" + Arrays.toString(accomodationList)
				+ ", transportationList=" + Arrays.toString(transportationList) + ", totalPrice=" + totalPrice + "]";
	}

}
