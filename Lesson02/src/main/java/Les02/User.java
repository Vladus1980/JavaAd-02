package Les02;

public class User {
	
	private int id;
	private String user_firstname;
	private String user_lastname;
	private int user_age;
	private String user_email;
	
	public User(int id, String user_firstname, String user_lastname, int user_age, String user_email) {
		super();
		this.id = id;
		this.user_firstname = user_firstname;
		this.user_lastname = user_lastname;
		this.user_age = user_age;
		this.user_email = user_email;
	}

	public User(String user_firstname, String user_lastname, int user_age, String user_email) {
		super();
		this.user_firstname = user_firstname;
		this.user_lastname = user_lastname;
		this.user_age = user_age;
		this.user_email = user_email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_firstname() {
		return user_firstname;
	}

	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}

	public String getUser_lastname() {
		return user_lastname;
	}

	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}

	public int getUser_age() {
		return user_age;
	}

	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user_firstname=" + user_firstname + ", user_lastname=" + user_lastname
				+ ", user_age=" + user_age + ", user_email=" + user_email + "]";
	}
	
	

}
