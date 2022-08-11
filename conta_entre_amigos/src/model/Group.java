package model;

public class Group {
	
	private String name;
    private String category;
    private String[] members;
    private int numberOfMembers;
    private String[] travelList;   
	private String[] accomodationList;
    private String[] transportationList;
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

    public String[] getMembers() {
        return members;
    }
    public void setMembers(String[] members) {
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
    
    
    public void deleteGroup(Group group){
        
    }
    
    public void editGroup(){
        
    }
    
    public void addTravel(){
        
    }
    
    public void addRestaurant(){
        
    }
    
    public String payList(){
        return "oi!";
    }
}
