
public class Group {

	private String name;
	private String category;
	private User[] members;
	private int numberOfMembers;
	private Travel[] travelList;
	private Restaurant[] restaurantList;
	private double totalPrice;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public User[] getMembers() {
		return members;
	}
	public void setMembers(User[] members) {
		this.members = members;
	}
	public int getNumberOfMembers() {
		return numberOfMembers;
	}
	public void setNumberOfMembers(int numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}
	public Travel[] getTravelList() {
		return travelList;
	}
	public void setTravelList(Travel[] travelList) {
		this.travelList = travelList;
	}
	public Restaurant[] getRestaurantList() {
		return restaurantList;
	}
	public void setRestaurantList(Restaurant[] restaurantList) {
		this.restaurantList = restaurantList;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
