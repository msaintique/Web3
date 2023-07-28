
public class User {
	
	String name,email,username,usertype,password;

	
	public User() {
		super();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(String name, String email, String username, String usertype, String password) {
		super();
		this.name = name;
		this.email = email;
		this.username = username;
		this.usertype = usertype;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
