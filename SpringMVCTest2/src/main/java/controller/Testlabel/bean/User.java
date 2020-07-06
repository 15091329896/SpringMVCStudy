package controller.Testlabel.bean;

public class User {
	String password;
	String username;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [password=" + password + ", username=" + username + "]";
	}

}