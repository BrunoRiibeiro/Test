package model;
import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String name;
    private String birthday;
    private List<String> friends = new ArrayList<>();
    private String [] yourGroups;
    private double balance;
    
    //get and set;

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

    public List<String> getFriends() {
        return friends;
    }
    public void setFriends(String friends[]) {
        
    }

    public String[] getYourGroups() {
        return yourGroups;
    }
    public void setYourGroups(String yourGroups[]) {
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
    
    public void addFriend(String friend){
        friends.add(friend);
    } 
    
    public void removeFriend(User friend){
        
    }
    
    public String friendList(){
        return "oi";
    }

}
