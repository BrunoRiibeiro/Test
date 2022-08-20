package model;
import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String name;
    private String birthday;
    private List<User> friends = new ArrayList<>();
    private List<Group> yourGroups = new ArrayList<>();
    private double balance;
    
    
    
    public User(String name, String birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public List<User> getFriends() {
		return friends;
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}

	public List<Group> getYourGroups() {
		return yourGroups;
	}

	public void setYourGroups(List<Group> yourGroups) {
		this.yourGroups = yourGroups;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
	public boolean deposity (User friend, double amount){
		return true;
	}

	public void addFriend(User friend){
        friends.add(friend);
    } 
    
    public void removeFriend(User friend){
        
    }
    
    public String friendList(){
        return "oi";
    }

	@Override
	public String toString() {
		return "User [name=" + name + ", birthday=" + birthday + ", friends=" + friends + ", yourGroups=" + yourGroups
				+ ", balance=" + balance + "]";
	}
    

}
