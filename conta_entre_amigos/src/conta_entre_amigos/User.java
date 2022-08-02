package conta_entre_amigos;

public class User {
	
	private String name;
    private String birthday;
    private String [] friends;
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

    public String[] getFriends() {
        return friends;
    }
    public void setFriends(String friends[]) {
        this.friends = friends;
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
    
    public void addFriend(User friend){
        
    } 
    
    public void removeFriend(User friend){
        
    }
    
    public String friendList(){
        return "oi";
    }

}
