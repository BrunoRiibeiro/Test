package model;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private String birthday;
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

	public List<Group> getYourGroups() {
		return yourGroups;
	}

	public void setYourGroups(List<Group> yourGroups) {
		this.yourGroups = yourGroups;
	}

	public double getBalance() {
		return balance;
	}

	public void deposity(double balance) {
		this.balance = balance;
	}
	
	public boolean withdraw(double amount) {
		if(this.balance >= amount) {
			this.balance -= amount;
			return true;
		}
		return false;
	}

	public boolean payin(User user, double amount) {
		if(this.balance >= amount) {
			this.withdraw(amount);
			user.deposity(amount);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", birthday=" + birthday + ", yourGroups=" + yourGroups
				+ ", balance=" + balance + "]";
	}

}
