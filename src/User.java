
public class User {
	
	private String name;
	private String brithday;
	private double balance;
	private Group[] yourGroups;
	private User[] friends;
	
	
	public void addFriend(User friend) {
		User[] moreFriends = new User[friends.length + 1];
		
		for(int i = 0; i < friends.length; i++) {
			moreFriends[i] = friends[i];
		}
		
		moreFriends[moreFriends.length -1] = friend;
	}
	
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getBirthday(){
		return birthday;
	}
	public void setBithday(String birthday){
		this.birthday = birthday;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public Group[] getYourGroups() {
		return yourGroups;
	}
	public void setYourGroups(Group[] yourGroups) {
		this.yourGroups = yourGroups;
	}
	public User[] getFriends() {
		return friends;
	}
	public void setFriends(User[] friends) {
		this.friends = friends;
	}
	
	
}
